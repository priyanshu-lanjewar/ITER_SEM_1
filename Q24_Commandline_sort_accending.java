/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-23
 * Description :a java program that takes three int values from the command line and prints them in
                ascending order. Use Math.min() and Math.max().
 */

public class Q24_Commandline_sort_accending {

	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		int max= Math.max(Math.max(n1, n2),n3);
		int min= Math.min(Math.min(n1, n2),n3);
		System.out.println("Accending sorting output => "+min+" "+(n1+n2+n3-max-min)+" "+max);

	}

}
