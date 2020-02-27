/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-6
 * Description :  a java program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
				  If ad - bc is 0, report that “The equation has no solution
 */
import java.util.Scanner;
public class Cramers_rule {

	public static void main(String[] args) {
		Scanner Coef=new Scanner(System.in);
		System.out.println("Linear equation in 2 variable are of form ax+by=e & cx+dy=f");
		System.out.println("Enter Value Of a,b,c,d,e,f :");
		double a=Coef.nextDouble();
		double b=Coef.nextDouble();
		double c=Coef.nextDouble();
		double d=Coef.nextDouble();
		double e=Coef.nextDouble();
		double f=Coef.nextDouble();
		double calc=(a*d-b*c);
		System.out.println("Two simultaneous equation entered are "+a+"x+"+b+"y="+e +" and "+c+"x+"+d+"y="+f);
		if(calc==0)
			System.out.println("Two simultaneous equation "+a+"x+"+b+"y="+e +" and "+c+"x+"+d+"y="+f +" Has no solution");
	}

}
