/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-14
 * Description :a java program that takes two positive integers as command-line arguments and prints true if either evenly divides the other
 */
public class Q14_Commandline_division_by_2 {
	public static void main(String[] numbers)
	{
		
		int a=Integer.parseInt(numbers[0]);
		int b=Integer.parseInt(numbers[1]);
		boolean result=((a%b==0)||(b%a==0));
		System.out.println(result);
	}
}
