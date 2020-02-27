/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-10
 * Description :  a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area
 */
import java.util.Scanner;
public class Q10_Area_of_triangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Co-ordinate Of First Point  : P1(x1,y1)= ");
		double p1x1=input.nextDouble();
		double p1y1=input.nextDouble();
		System.out.print("Enter Co-ordinate Of Second Point : P2(x2,y2)= ");
		double p2x2=input.nextDouble();
		double p2y2=input.nextDouble();
		System.out.print("Enter Co-ordinate Of Second Point : P3(x3,y3)= ");
		double p3x3=input.nextDouble();
		double p3y3=input.nextDouble();
		double distsquare_l1 = Math.abs((((p2x2-p1x1)*(p2x2-p1x1))+((p2y2-p1y1)*(p2y2-p1y1))));
		double distsquare_l2 = Math.abs((((p3x3-p2x2)*(p3x3-p2x2))+((p3y3-p2y2)*(p3y3-p2y2))));
		double distsquare_l3 = Math.abs((((p3x3-p1x1)*(p3x3-p1x1))+((p3y3-p1y1)*(p3y3-p1y1))));
		double distance_l1=Math.sqrt(distsquare_l1);
		double distance_l2=Math.sqrt(distsquare_l2);
		double distance_l3=Math.sqrt(distsquare_l3);
		
		double semiperimeter=(distance_l1+distance_l2+distance_l3)/2;
		double area=Math.sqrt(semiperimeter*(semiperimeter-distance_l1)*(semiperimeter-distance_l2)*(semiperimeter-distance_l3));
System.out.println("Area of Triangle is = "+area);
	}

}