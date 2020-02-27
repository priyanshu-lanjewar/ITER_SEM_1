/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-16
 * Description : a java program that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice)
 */
public class Q16_Commandline_sum_random_no {

	public static void main(String[] integer) {
	int a=1;
	int b=6;
	double x=Math.random();
	System.out.println(x);
		int output1=(int)(a+x*(b-a)+1);
		int output2=(int)(a+Math.random()*(6-1)+1);
		System.out.println("Random # 1==> "+output1);
		System.out.println("Random # 2==> "+output2);
		System.out.println("Sum of Random # 1 and Random # 2==> "+(output1+output2));
	}

}
