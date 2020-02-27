/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-2
 * Description :  a java program that reads in the radius and length of a cylinder and computes the area and volume
 */
import java.util.Scanner;

public class Q02_Area_volume_cylinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height Of Cylinder : ");
		double Height=sc.nextDouble();
		System.out.println("Enter Radius Of Cylinder : ");
		double Radius=sc.nextDouble();
		double area = (22.0/7.0)*Radius*Radius;
		double volume = area*Height;
		System.out.println("Area of Cylinder is "+area);
		System.out.println("Volume Of Cylinder is "+volume);

	}

}
