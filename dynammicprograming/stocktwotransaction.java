package dynammicprograming;

import java.util.Scanner;

public class stocktwotransaction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int mpist=0;
        int lsf=arr[0];
        int[] dp=new int[n];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<lsf){
                lsf=arr[i];
            }
            mpist=arr[i]-lsf;
            if(mpist>dp[i-1]){
                dp[i]=mpist;
            }else{
                dp[i]=dp[i-1];
            }
        }
        int mpibt=0;
        int maxat=arr[arr.length-1];
        int[] dp1=new int[arr.length];
        for(int i=arr.length-2;i>=0;i--){
            if(maxat<arr[i]){
                maxat=arr[i];
            }
            mpibt=maxat-arr[i];
            if(mpibt>dp1[i+1]){
                dp1[i]=mpibt;
            }else{
                dp1[i]=dp1[i+1];
            }
        }
        int op=0;
        for(int i=0;i<arr.length;i++){
            if(dp[i] +dp1[i]>op){
                op=dp[i]+dp1[i];
            }
        }
        System.out.println(op);
    }
    
}
