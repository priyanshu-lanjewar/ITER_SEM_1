/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-18
 * Description :a java program which displays an appropriate name for a person, using a combination 
				of nested ifs and compound conditions. Ask the user for a gender, first name, last name and 
				age. If the person is female and 20 or over, ask if she is married. If so, display "Mrs." in 
				front of her name. If not, display "Ms." in front of her name. If the female is under 20, 
				display her first and last name. If the person is male and 20 or over, display "Mr." in front 
				of his name. Otherwise, display his first and last name. Note that asking a person if they 
				are married should only be done if they are female and 20 or older, which means you will 
				have a single if and else nested inside one of your if statements.
 */
import java.util.Scanner;
public class Biodata {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Your Gender (M Or F) :");
		char gender=in.next().charAt(0);
		System.out.print("Enter Fisrt Name : ");
		String name = in.next();
		System.out.print("Enter Last Name :");
		String last_name = in.next();
		System.out.print("Enter Age : ");
		int age = in.nextInt();
		if(gender == 'F' && age>=20)
		{
			System.out.println("Are You Married (Y or N) ? ");
			char mar=in.next().charAt(0);
			if(mar == 'Y')
				System.out.println("Then I shall Call You Mrs."+name+" "+last_name+".");
			else if(mar == 'N')
				System.out.println("Then I shall Call You Ms."+name+".");
			else
				System.out.println("Error In Input");
		}
		else if(gender=='M'||gender=='F')
		{
			if(age>=20)
				System.out.println("Then I shall Call You Mr."+name+".");
			else
				System.out.println("Then I shall Call You "+name+" "+last_name+".");
		} 
		else
			System.out.println("Error In Gender Input");
	} 

}
