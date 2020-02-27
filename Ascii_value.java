/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-4
 * Description : a java program to determine whether the character entered is a capital letter, a small case letter, a digit or a special symbol. The 
                 following table shows the range of ASCII values for various characters
 */
import java.util.Scanner;
public class Ascii_value {

	public static void main(String[] args) {
		Scanner nu=new Scanner(System.in);
		System.out.println("Enter any character or no :");
		char ch=nu.next().charAt(0);
		if((ch>='A')&&(ch<='Z')) 
			System.out.println("Inputed Data "+ch+" is a Upper case Alphabet");
		else if((ch>='a')&&(ch<='z'))
			System.out.println("Inputed Data "+ch+" is a Lower case Alphabet");
		
		else if((ch>='0')&&(ch<='9')) 
			System.out.println("Inputed Data "+ch+" is a Number");
		
		else System.out.println("Inputed Data "+ch+" is a Special character");
		
	}

}
