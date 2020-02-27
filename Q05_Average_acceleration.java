/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-5
 * Description :  a java program that prompts the user to enter the starting velocity v0 in meters/second, 
                  the ending velocity v1 in meters/second, and the time span t in seconds, and displays the 
                  average acceleration
 */
import java.util.Scanner;
public class Q05_Average_acceleration {

	public static void main(String[] args) {
		//a java program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Inital Velocity (m/s). V1 = ");
		double V1=sc.nextDouble();
		System.out.println("Enter Inital Velocity (m/s). V2 = ");
		double V2=sc.nextDouble();
		System.out.println("Enter Time interval (sec).    t = ");
		double t=sc.nextDouble();
		double avg=(V2-V1)/t;
		System.out.println("The Average Acceleration Is a = "+avg+" m/s^2");
		
	}

}
