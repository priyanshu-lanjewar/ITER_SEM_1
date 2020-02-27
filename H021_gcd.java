import java.util.Scanner;
public class H021_gcd {
    public static void main(String[] args) {
       Scanner Sc=new Scanner (System.in);
       System.out.print( "Enter 2 Numbers To Find G.C.D. = ");
       int a=Sc.nextInt();
       int b=Sc.nextInt();
       while(a!=b) {
           if(a>b)
           a=a-b;
           else
           b=b-a;
       }
       System.out.println("GCD="+a);
       }
}
