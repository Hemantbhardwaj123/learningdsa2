package dynammicprograming;
import java.util.*;
public class unboundedknapsack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] vals=new int[n];
        int[] wts=new int[n];
        for(int i=0;i<vals.length;i++){
            vals[i]=sc.nextInt();
        }
        for(int i=0;i<wts.length;i++){
            wts[i]=sc.nextInt();
        }
        int cap=sc.nextInt();
        int[] dp= new int[cap+1];
        dp[0]=0;
        for(int bagc=0;bagc<cap;cap++){
            int max=0;
            for(int i=0;i<n;i++){
                if(bagc>=wts[i]){
                    int rbagc=bagc-wts[i];
                    int rbagv=dp[rbagc];
                    int trval=rbagv+vals[i];
                    if(trval>max){
                        max=trval;
                }
            }
            }
            dp[bagc]=max;
        }
        System.out.println(dp[cap]);
    }
}
