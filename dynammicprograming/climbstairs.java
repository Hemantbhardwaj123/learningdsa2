package dynammicprograming;
import java.util.*;
public class climbstairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cp=CountPathsTab(n);
        System.out.println(cp);
    }
    public static int CountPaths(int n,int[] qb){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(qb[n]>0){
            return qb[n];
        }
        int cp1=CountPaths(n-1,qb);
        int cp2=CountPaths(n-2,qb);
        int cp3=CountPaths(n-3,qb);
        int cp=cp1+cp2+cp3;
        qb[n]=cp;
        return cp;
    }
    public static int CountPathsTab(int n){
        int[] dp=new int[n+1];

        dp[0]=1;
        for(int i=0;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
}
