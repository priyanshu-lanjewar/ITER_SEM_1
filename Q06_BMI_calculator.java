/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-6
 * Description : a java program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
 */
import java.util.Scanner;
public class Q06_BMI_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Weight (in pounds) : ");
		double weight=sc.nextDouble();
		System.out.println("Enter Height (in inches) : ");
		double height=sc.nextDouble();
		double wkg=weight*0.45359237;
		double hm=height*0.0254;
		double bmi = wkg/(hm*hm);
		System.out.println("BMI is "+bmi);

	}

}
