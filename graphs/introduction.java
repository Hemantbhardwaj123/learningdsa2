package graphs;
import java.util.*;
public class introduction {
    static class Edge{
        int src;
        int nbr;
        int wt;
        Edge(int src,int nbr,int wt){
            this.src=src;
            this.wt=wt;
            this.nbr=nbr;
        }
    }
    public static void main(String[] args) throws Exception{
        int vtces = 7;
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,20));
        graph[0].add(new Edge(0,2,20));

        graph[1].add(new Edge(1,2,40));
        graph[1].add(new Edge(1,3,30));
        graph[1].add(new Edge(1,0,20));
    }
}
