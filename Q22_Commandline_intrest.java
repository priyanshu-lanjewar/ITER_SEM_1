/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-22
 * Description :a java program that calculates the monthly payments you would have to make over
                a given number of years to pay off a loan at a given interest rate compounded continuously,
                taking the number of years t, the principal P, and the annual interest rate r as command-line
                arguments. The desired value is given by the formula P*Math.exp(r*t)
 */

public class Q22_Commandline_intrest {

	public static void main(String[] args) {
		double t=Double.parseDouble(args [0]);
		double p=Double.parseDouble(args [1]);
		double r=Double.parseDouble(args [2]);
		double ans=p*Math.exp(r*t);
		System.out.println(ans);

	}

}
