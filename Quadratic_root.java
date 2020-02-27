/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-5
 * Description : a java program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant 
                 is 0, display one root. Otherwise, display “The equation has no real roots”
 */
import java.util.Scanner;
public class Quadratic_root {

	public static void main(String[] args) {
		Scanner nu=new Scanner(System.in);
		System.out.println("Quadratic eqution is in form of ax*x +bx+c=0 ");
		System.out.println("Enter value of a =  ");
		int a=nu.nextInt();
		System.out.println("Enter value of b =  ");
		int b=nu.nextInt();
		System.out.println("Enter value of c =  ");
		int c=nu.nextInt();
		double discri = (Math.pow(b, 2)-4*a*c);
		if(discri>0){
			double x1=((-1*b)+Math.sqrt(discri))/(2*a);
			double x2=((-1*b)-Math.sqrt(discri))/(2*a);
			System.out.print("Equation has 2 real roots  x="+x1 +" and x = "+x2);
		}
		else if(discri==0) {
			double x=((-1*b)/(2*a));
			System.out.print("Only one Real Root Exists : x=");
			System.out.println(x);
			
		}
		else
			System.out.println("No Real roots Exists ");
		}
	
}
