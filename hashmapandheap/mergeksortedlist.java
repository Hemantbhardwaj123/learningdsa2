
    import java.io.*;
    import java.util.*;
    
    public class mergeksortedlist {
        public static class Pair implements Comparable<Pair>{
            int li;
            int di;
            int val;
            Pair(int li,int ld,int val){
                this.li=li; //li=listindex
                this.di=di; // di=data index
                this.val=val;//va;=data value
            }
            public int compareTo(Pair o){
                return this.val-o.val;
            }
        }
       public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
          ArrayList<Integer> rv = new ArrayList<>();
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        for(int i=0;i<lists.size();i++){
            Pair p= new Pair(i,0,lists.get(i).get(0));// with this line we add all th inputs from lists into pq
            pq.add(p);
        }
        while(pq.size()>0){
            Pair p=pq.remove();
            rv.add(p.val);
            p.di++;
            if(p.di<lists.get(p.li).size()){ // matlab jo data ka index h agr vo apni list ki size se chota h toh 
                p.val=lists.get(p.li).get(p.di);
                pq.add(p);
            }

        }
          return rv;
       }
    
       public static void main(String[] args) throws Exception {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int k = Integer.parseInt(br.readLine());
          ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
          for(int i = 0; i < k; i++){
             ArrayList<Integer> list = new ArrayList<>();
    
             int n = Integer.parseInt(br.readLine());
             String[] elements = br.readLine().split(" ");
             for(int j = 0; j < n; j++){
                list.add(Integer.parseInt(elements[j]));
             }
    
             lists.add(list);
          }
    
          ArrayList<Integer> mlist = mergeKSortedLists(lists);
          for(int val: mlist){
             System.out.print(val + " ");
          }
          System.out.println();
       }
    
    }
