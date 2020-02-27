/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-3
 * Description : To check whether the number is even or odd
 */
import java.util.Scanner;
public class odd_even {

	public static void main(String[] args) {
		Scanner nu=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=nu.nextInt();
		if(number%2==0)
		System.out.println("The Number is Even");
		else
		System.out.println("The Number is Odd");

	}

}
