/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-12
 * 
 * Description : a java program that asks the user how many eggs she has and then tells the user how many dozen eggs she has and how many extra eggs are left over.
                 A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user how many gross, how many dozen, and how many left over eggs she has.
 */
import java.util.Scanner;

public class Q12_Egg_wala_prog {

	public static void main(String[] args) {
		Scanner egg=new Scanner(System.in);
		System.out.print("Please enter the number of eggs u have : ");
		int eggs=egg.nextInt();
		int gross=eggs/144;
		int grossrem=eggs%144;
		int dozen=grossrem/12;
		int num=grossrem%12;
		System.out.println("The no of eggs you hold is "+gross+" gross , "+dozen+" dozen & "+ num);
	}

}
