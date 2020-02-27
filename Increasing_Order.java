/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-12
 * Description :a java program that prompts the user to enter three integers and display the integers
				in non-decreasing order.
 */
import java.util.Scanner;
public class Increasing_Order {

	public static void main(String[] args) {
		Scanner no=new Scanner(System.in);
		System.out.println("Enter # Numbers : ");
		int n1=no.nextInt();
		int n2=no.nextInt();
		int n3=no.nextInt();
		if(n1<n2)
		{
			if(n1<n3) {
				
				if(n2<n3)
				{
					System.out.print(n1+" "+n2+" "+n3);
				}
				else
				{
					System.out.print(n1+" "+n3+" "+n2);
				}
			}
			else
				{
					System.out.print(n3+" "+n1+" "+n2);
						
				}
		}
		else
		{
			if(n2<n3)
			{
				if(n1<n3)
				{
					System.out.print(n2+" "+n1+" "+n3);
				}
				else
				{
					System.out.print(n2+" "+n3+" "+n1);
				}
			}
			else
			{
				System.out.print(n3+" "+n2+" "+n1);
			}

	}

	}
}

