package dynammicprograming;

import java.util.Scanner;

public class arrangebuilding {
    public static void main(String[] args) {
        // we can use int also but due too pepcoding i use long contraint
        Scanner sc= new Scanner(System.in);
        long n= sc.nextInt();
        long obuilding=1;
        long ospace=1;
        for(int i=2;i<n;i++){
             long  nbuilding=ospace;
             long nspace=obuilding+ospace;
             
             obuilding= nbuilding;
             ospace=nspace;
        }
        long total=obuilding+ospace;
        total=total*total;
        System.out.println(total);
    }
}
