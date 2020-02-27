/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-16
 * Description :
 */
import java.util.Scanner;
public class Grading_pattern {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.print("Enter Marks Scored By Students : ");
		int marks = o.nextInt();
		int m = marks/10;
		
		switch(m)
		{
			case 10:
			case 9:
				System.out.println("Grade \"O\"");
		        break;
			case 8:
				System.out.println("Grade \"A\"");
		        break;
			case 7:
				System.out.println("Grade \"B\"");
		        break;
			case 6:
				System.out.println("Grade \"C\"");
		        break;
			case 5:
				System.out.println("Grade \"D\"");
		        break;
			case 4:
				System.out.println("Grade \"E\"");
		        break;
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("Grade \"F\"");
		        break;
		      default :
		    	  System.out.println("Marks : \"Error\"");
			        break;
		}
		

	}

}
