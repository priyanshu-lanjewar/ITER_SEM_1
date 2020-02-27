import java.util.Scanner;
public class Q009_SUM_OF_FRACTION_ {
 public static int GCD(int x,int y)
 {
	 while(x!=y) {
	 if(x>y)
		 x=x-y;
	 else if(y>x)
		 y=y-x;
	 }
	 return x;
	
 }
 public static double LCM(int x,int y,int gcd) {
	 int pro = x*y;
	 double lcm = (double)pro/gcd;
	 return lcm;
 }
 public static double SOLUTION(int a,int b,int c, int d,double lcm)
 {
	 double soln = ((lcm/b)*a  +  (lcm/d)*c)/lcm;
	 return soln;
 }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in)
				;
		System.out.print("Enetr Value of a , b , c, d  for(a/b and c/d ) " ); 
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int gcd = Q010_SUM_OF_FRACTION_.GCD(b, d);
		double lcm = Q010_SUM_OF_FRACTION_.LCM(b, d, gcd);
		System.out.println(lcm);
		double opt = Q010_SUM_OF_FRACTION_.SOLUTION(a, b, c, d, lcm);
		System.out.println("ANS = "+opt);
		
	}

}
