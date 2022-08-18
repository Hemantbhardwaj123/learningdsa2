package dynammicprograming;
import java.util.*;
public class countbinarystrings {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();

    int oczeros=1;
    int ocones=1;
    for(int i=2;i<=n;i++){
        int nczeros=oczeros;
        int ncones=oczeros+ocones;

        oczeros=nczeros;
        ocones=ncones;
    }
    System.out.println(ocones+oczeros);
 }   
}
