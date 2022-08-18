package dynammicprograming;
import java.util.*;
public class besttimetobuysellstock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[] prices=new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        int lsf=Integer.MAX_VALUE;
        int op=0;
        int pist=0;
        for(int i=0;i<n;i++){
            if(prices[i]<lsf){
                prices[i]=lsf;
            }
            pist=prices[i]-lsf;
            if(pist>op){
                op=pist;
            }
        }
        System.out.println(op);
    }
}
