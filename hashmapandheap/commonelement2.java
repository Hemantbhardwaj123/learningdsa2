import java.util.*;
public class commonelement2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int[] arr1= new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int n2= sc.nextInt();
        int[] arr2= new int[n1];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> fmap= new HashMap<>();
        for(int val:arr1){
            if(fmap.containsKey(val)){
                int of=fmap.get(val);
                int nf=of+1;
                fmap.put(val,nf);
            }else{
                fmap.put(val,1);
            }
        }
        for(int val:arr2){
            if(fmap.containsKey(val) && fmap.get(val)>0){ // frequency map ke ander uski frequency 0 se badi h0
                System.out.println(val);
                int of=fmap.get(val);
                int nf=of-1;
                fmap.put(val,nf);
            }
        }
    }
}
// test cases are failed in pepcoding