package dynammicprograming;
import java.util.*;
public class stockswithcooldown {
    //  we can only buy after cooldown so we takes the value of csp for calculate bsp
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        int obsp=-prices[0];
        int ossp=0;
        int ocsp=0;
      for(int i=0;i<n;i++){
        int nbsp=0;
        int nssp=0;
        int ncsp=0;
        if(ocsp-prices[i]>obsp){
            nbsp=ocsp-prices[i];
        }else{
            nbsp=obsp;
        }

        if(obsp +prices[i]>ossp){
            nssp=obsp+prices[i];
        }else{
            nssp=ossp;
        }

        if(ossp>ocsp){
            ncsp=ossp;
        }else{
            ncsp=ocsp;
        }
        obsp=nbsp;
        ossp=nssp;
        ocsp=ncsp;
      }
      System.out.println(ossp);
    }
    
}
