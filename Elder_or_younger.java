/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-8
 * Description :If the ages of Rahul, Ayush and Ajay are input through the keyboard, write a java program to
determine the elder among them.
 */
import java.util.Scanner;
public class Elder_or_younger {

	public static void main(String[] args) {
		Scanner age=new Scanner(System.in);
		System.out.println("Enter Age of Rahul =");
		int rahul=age.nextInt();
		System.out.println("Enter Age of Ayush =");
		int ayush=age.nextInt();
		System.out.println("Enter Age of Ajay =");
		int ajay=age.nextInt();
		if(rahul>ayush)
		{
			if(rahul>ajay)
			{
				System.out.println("Rahul is eldest");
			}
			else
			{
				System.out.println("Ajay is eldest");
			}
		}
		else
			if(ayush>ajay)
			{
				System.out.println("Ayush is eldest");
			}
			else
				System.out.println("Ajay is eldest");
	}

}
