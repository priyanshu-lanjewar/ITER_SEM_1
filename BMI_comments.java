/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F                               
 * Assignment / Question : Assignment-3/Que-11
 * Description : less than 18.5 underweight 
				 18.5 to 24.9 normal weight 
				 25.0 to 29.9 overweight 
				 30.0 or more obese 
 */
import java.util.Scanner;
public class BMI_comments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Weight (in kg) : ");
		double weight=sc.nextDouble();
		System.out.println("Enter Height (in m) : ");
		double height=sc.nextDouble();
		double bmi = weight/(height*height);
		System.out.println("BMI is "+bmi);
		if(bmi<18.5)
			System.out.println("The person is underweight");
		else if(bmi<25)
			System.out.println("The person has normal weight");
		else if(bmi<30)
			System.out.println("The person is over weight");
		else
			System.out.println("The person is obese");

	}

}
