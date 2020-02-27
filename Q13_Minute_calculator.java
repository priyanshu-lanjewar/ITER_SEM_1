/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-13
 * Description :a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes
 */
import java.util.Scanner;
public class Q13_Minute_calculator {

	public static void main(String[] args)
	{
		Scanner minutes=new Scanner(System.in);
		System.out.print("Enter Number Of Minutes : ");
		long min=minutes.nextLong();
		int year=(int)min/525600;
		double timeleft=min%525600;
		double days=(int)timeleft/1440;
		
		System.out.println(min + " minutes is approximately equals to "+year+" years and "+days+" days.");
		
	}
}
