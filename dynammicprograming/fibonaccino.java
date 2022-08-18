package dynammicprograming;
import java.util.*;
public class fibonaccino {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
            int tfib=FibMemoised(n,new int[n+1]);
            System.out.println(tfib);
    }

    // this method is not best for fibonaaci because  its time complexity is very high and  it counts same no multiple times
    // public static int  fib(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     int fib2=fib(n-1);
    //     int fib1=fib(n-2);
    //     int tfib=fib1+fib2;
    //     return tfib;
    // }
    public static int FibMemoised(int n,int[] qb){
        if(n==0 || n==1){
                    return n;
                }
                if(qb[n]!=0){
                    return qb[n];
                }
                int fib1=FibMemoised(n-1,qb);
                int fib2=FibMemoised(n-2,qb);
                int tfib=fib1+fib2;
                qb[n]=tfib;
                return tfib;
    }
}

