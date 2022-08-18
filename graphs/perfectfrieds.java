package graphs;

import java.io.*;
import java.util.*;

public class perfectfrieds {
    static class Edge {
        int src;
        int nbr;
      

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // write your code here
       
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]= new ArrayList<>();
        }
        for(int e=0;e<k;e++){
            // String line=br.readLine();
            // String[] parts=line.split(" ");

            String[] parts = br.readLine().split(" ");
            int v1=Integer.parseInt(parts[0]);
            int v2=Integer.parseInt(parts[1]);

            graph[v1].add(new Edge(v1,v2, v2));
            graph[v2].add(new Edge(v2,v1, v2));
        }
        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        for (int v = 0; v < n; v++) {
            if (visited[v] == false) {
                ArrayList<Integer> comp = new ArrayList<>();
                drawTree(graph, v, comp, visited);
                comps.add(comp);
            }
        }
        int pairs=0;
        for(int i=0;i<comps.size();i++){
            for(int j=i+1;j<comps.size();j++){
                int count=comps.get(i).size()*comps.get(j).size();
                pairs+=count;
            }
        }
        System.out.println(pairs);
    }

    public static void drawTree(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp, boolean[] visited) {
        comp.add(src);
        visited[src] = true;
        for (Edge e : graph[src]) {
            if (visited[e.nbr] == false) {
                drawTree(graph, e.nbr, comp, visited);
            }
        }
    }

}