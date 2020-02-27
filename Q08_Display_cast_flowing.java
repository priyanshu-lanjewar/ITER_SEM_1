/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-8
 * Description :a java program that displays the following table. Cast floating-point numbers into integers
 */
import java.util.Scanner;
public class Q08_Display_cast_flowing {

	public static void main(String[] args) {
		/**/
		Scanner sc=new Scanner(System.in);
				int a1=1,a2=2,a3=3,a4=4,a5=5;
				int b1=2,b2=3,b3=4,b4=5,b5=6;
				double pow1,pow2,pow3,pow4,pow5;
				pow1=Math.pow(a1,b1);
				pow2=Math.pow(a2,b2);
				pow3=Math.pow(a3,b3);
				pow4=Math.pow(a4,b4);
				pow5=Math.pow(a5,b5);
				System.out.print("a          b          ");
				System.out.println("pow(a,b)");
				System.out.print(a1+"          "+b1+"             ");
				System.out.println((int)pow1);
				System.out.print(a2+"          "+b2+"             ");
				System.out.println((int)pow2);
				System.out.print(a3+"          "+b3+"             ");
				System.out.println((int)pow3);
				System.out.print(a4+"          "+b4+"            ");
				System.out.println((int)pow4);
				System.out.print(a5+"          "+b5+"           ");
				System.out.println((int)pow5);
				
	}

}
