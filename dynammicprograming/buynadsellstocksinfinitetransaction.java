package dynammicprograming;
import java.util.*;
public class buynadsellstocksinfinitetransaction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        int sd=0;
        int bd=0;
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>=prices[i-1]){
                sd++;
            }else{
                profit+=prices[sd]-prices[bd];
                sd=bd=i;
            }
        }
        profit+=prices[sd]-prices[bd];   
        System.out.println(profit);
    }
}
