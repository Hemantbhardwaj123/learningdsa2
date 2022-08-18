package dynammicprograming;
import java.util.*;


public class coinchangecombination {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int amt=sc.nextInt();

        int[] dp= new int[amt+1];
        dp[0]=1;
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<dp.length;j++){
                dp[j]+=dp[j-arr[i]]; //amoount=amount-coins so it becomes remaining amount
            }
        }
        System.out.println(dp[amt]);
    }
}
