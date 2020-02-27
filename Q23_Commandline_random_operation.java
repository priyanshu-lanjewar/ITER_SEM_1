/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-24
 * Description : a java program that prints five uniform random values between 0 and 1, their average
value, and their minimum and maximum value. Use Math.random(), Math.min(), and
Math.max()
 */

public class Q23_Commandline_random_operation {

	public static void main(String[] args) {
		double n1=Math.random();
		double n2=Math.random();
		double n3=Math.random();
		double n4=Math.random();
		double n5=Math.random();
		double avg=(n1+n2+n3+n4+n5)/5;
		System.out.println("First  random # : "+n1);
		System.out.println("Second random # : "+n2);
		System.out.println("Third  random # : "+n3);
		System.out.println("Forth  random # : "+n4);
		System.out.println("Fifth  random # : "+n5);
		System.out.println("Average of random number is : "+avg);
		System.out.println("Maximum of random # : "+Math.max(Math.max(Math.max(Math.max(n1,n2),n3), n4),n5));
		System.out.println("Minimum of random # : "+Math.min(Math.min(Math.min(Math.min(n1,n2),n3), n4),n5));
	}

}
