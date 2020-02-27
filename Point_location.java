import java.util.Scanner;

/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-7
 * Description :a java program that takes the x – y coordinates of a point in the Cartesian plane and
				prints a message telling either an axis on which the point lies or the quadrant in which it is
				found.
 */
import java .util.Scanner;
public class Point_location {

	public static void main(String[] args) {
		Scanner point=new Scanner(System.in);
		System.out.println("Enter x coordinate of point P==> x=");
		double x=point.nextDouble();
		System.out.println("Enter y coordinate of point P==> y=");
		double y=point.nextDouble();
		System.out.println("Entered point P is ("+x+","+y+")");
		if(x>0&&y>0)
		System.out.println("The point ("+x+","+y+") is in I Quadrant");
		else if(x<0&&y>0)
		System.out.println("The point ("+x+","+y+") is in II Quadrant");
		else if(x<0&&y<0)
		System.out.println("The point ("+x+","+y+") is in III Quadrant");
		else
		System.out.println("The point ("+x+","+y+") is in IV Quadrant");


	}

}
