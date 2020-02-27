/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-15
 * Description :a java program that takes two int values a and b from the command line and prints a 
                random integer between a and b.
 */
public class Q15_Commandline_random_no {

	public static void main(String[] integer) {
		int a=Integer.parseInt(integer[0]);
		int b=Integer.parseInt(integer[1]);
		int output=(int)((a+Math.random()*(b-a+1)));
		System.out.println(output);
	}

}
