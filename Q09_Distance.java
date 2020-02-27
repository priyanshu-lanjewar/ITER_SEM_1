/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-9
 * Description :  a java program that prompts the user to enter two points (x1, y1) and (x2, y2) and 
                  displays their distance between them
 */
import java.util.Scanner;
public class Q09_Distance {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Co-ordinate Of First Point  : P1(x1,y1)= ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.println("Enter Co-ordinate Of Second Point : P2(x2,y2)= ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double distsquare = (((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		double distance=Math.sqrt(distsquare);
		System.out.println("Distance Between Point is "+ distance);

	}

}
