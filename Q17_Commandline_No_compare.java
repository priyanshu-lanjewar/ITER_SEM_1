/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-17
 * Description :a java program that takes three positive integers as command-line arguments and
                prints true if any one of them is greater than or equal to the sum of the other two and false
                otherwise.
 */

public class Q17_Commandline_No_compare {

	public static void main(String[] numbers) {

		int n1=Integer.parseInt(numbers[0]);
		int n2=Integer.parseInt(numbers[1]);
		int n3=Integer.parseInt(numbers[2]);
		int sum1=n2+n3;
		int sum2=n1+n3;
		int sum3=n1+n2;
		boolean result=((sum1>n1)||(sum2>n2)||(sum3>n3));
		System.out.println(result);
		
	}

}
