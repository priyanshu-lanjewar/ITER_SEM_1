/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-11
 * Description :  a java program that reads in investment amount, annual interest rate, and number of 
                  years, and displays the future investment value
 */
import java.util.Scanner;
public class Q11_Future_investment_value {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter Investment amount           =>  Rs.");
	double investment=input.nextDouble();
	System.out.print("Enter Annual intrest rate in %age =>  ");
	double intrest=input.nextDouble();
    System.out.print("Enter Number of Years             =>  ");
	double time=input.nextDouble();
    double future_investment_value = investment * Math.pow((1+(intrest/1200)),time*12);
    System.out.println("Accumulated value is Rs."+future_investment_value);
	}

}
