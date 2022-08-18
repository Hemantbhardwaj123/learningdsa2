package dynammicprograming;
import java.util.*;
public class stockwithtransactionfee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        int fee=sc.nextInt();
        int obsp=-prices[0];
        int ossp=0;
      for(int i=0;i<n;i++){
        int nbsp=0;
        int nssp=0;
            if(ossp-prices[i]>obsp){
                nbsp=ossp-prices[i];
            }else{
                nbsp=obsp;
            }

            if(obsp+prices[i]-fee>ossp){
                nssp=obsp+prices[i]-fee;
            }else{
                nssp=ossp;
            }
            ossp=nssp; //old abb hamari new bn jayengi
            obsp=nbsp;
      }
      System.out.println(ossp);
    }
    
}
