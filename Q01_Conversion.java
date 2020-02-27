/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-1
 * Description : a java program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result
 */
import java.util.Scanner;
public class Q01_Conversion {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Value Of Temperature In Degree Celsius : ");
	double cent=sc.nextDouble();
	double fahrenheit=(9.0/5.0)*cent+32;
	System.out.println("Temperature In Degree Fahrenheit is : "+fahrenheit);

	}

}
