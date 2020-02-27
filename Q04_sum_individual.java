/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-4
 * Description :  a java program that reads an integer between 0 and 1000 and adds all the digits in the integer
 */
import java.util.Scanner;
public class Q04_sum_individual 

//a java program that reads an integer between 0 and 1000 and adds all the digits in the
//integer. For example, if an integer is 932, the sum of all its digits is 14.
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number Between 0 and 1000");
		int number1=sc.nextInt();
		int rem1 = number1%10;
		int que1 = number1/10;
		int que2=que1/10;
		int rem2=que1%10;
		int que3=que2/10;
		int rem3=que2%10;
		int que4=que3/10;
		int rem4=que3%10;
		int sum= rem1+rem2+rem3+rem4;
       System.out.println("Sum of Digits Is " + sum);
       
	}

}
