/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-3
 * Description :  a java program that reads a number in feet, converts it to meters, and displays the  result
 */
import java.util.Scanner;
public class Q03_feet_to_meter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value in feet : ");
		double feet=sc.nextDouble();
		double meter=feet*0.305;
		System.out.println(feet+ " feet is "+meter+" meter");

	}

}
