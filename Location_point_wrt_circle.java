/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-15
 * Description :
 */
import java.util.Scanner;
public class Location_point_wrt_circle 
{

	public static void main(String[] args) 
	{
		java.util.Scanner o=new Scanner(System.in);
		//Equation of circle with centre(0,0) and radius 10 is (X)square + (y)square = (10)square
		//locatoion can be find directly by subistituting x and  y value in circle eqn;
		// eqn of circle = C(x,y)=(x^2)+(y^2)-100
		// if C(x,y)>0 => point outside Circle
		// if C(x,y)=0 => point on circle
		// if C(x,y)<0 => point inside Circle
		System.out.print("Enter Point's x Coordinate = > x=");
		double x = o.nextDouble();
		System.out.print("Enter Point's y Coordinate = > y=");
		double y = o.nextDouble();
		double location = Math.pow(x,2) + Math.pow(y, 2) -100 ;
		if(location > 0)
			System.out.println("Point P("+x+","+y+") Lies Outside Circle with Center at (0,0) and Radius 10u.");
		else if(location==0)
			System.out.println("Point P("+x+","+y+") Lies on Circle with Center at (0,0) and Radius 10u.");
		else
			System.out.println("Point P("+x+","+y+") Lies Inside Circle with Center at (0,0) and Radius 10u.");
	}

}
