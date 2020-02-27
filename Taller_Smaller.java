/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-1
 * Description :a java program to input the height of the person and check if the height of the person 
                is greater than or equal to 6 feet then print the message “The person is tall”.
 */
import java.util.Scanner;
public class Taller_Smaller {

	public static void main(String[] args) {
		Scanner high=new Scanner(System.in);
		System.out.print("Enter Height of Person (in feets): ");
		double height=high.nextDouble();
		if(height>=6)
		{
			System.out.println("The Person is tall.");
		}
		System.out.println("Thankyou");

	}

}
