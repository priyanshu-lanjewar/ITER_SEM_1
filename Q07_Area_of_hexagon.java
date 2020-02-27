/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-7
 * Description :  a java program that prompts the user to enter the side of a hexagon and displays its area
 */
import java.util.Scanner;
public class Q07_Area_of_hexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length Of Side Of Regular Hexagon : ");
		double side=sc.nextDouble();
		double a=3;
		double power = 2;
		double sidesquare=Math.pow(side,power);
		double root3=Math.sqrt(a);
		double area=((3*root3)/2)*sidesquare;
		System.out.println("Area f Regular Hexagon is : "+area);
	}

}
