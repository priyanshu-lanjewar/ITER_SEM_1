import java.util.Scanner;
public class H020_scm
{
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
	public static void main(String args[])
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter 2 number : ");
	int p=sc.nextInt();
	int n=sc.nextInt();
	int gcd = H020_scm.GCD(p, n);
	int lcm = (int) H020_scm.LCM(p, n, gcd);
	System.out.println("LCM = "+lcm);

}}
		