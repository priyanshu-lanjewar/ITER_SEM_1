/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-19
 * Description : the basic salary of an employee of an organization through the command prompt. His
                 dearness allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20%
                 of basic salary. Write a java program to calculate his gross salary
 */

//GS=BS+DA+HRA
public class Q19_Commandline_Salary {

	public static void main(String[] args) {
		int bs=Integer.parseInt(args [0]);
		double da=(bs*0.4);
		double hra=(bs*0.2);
		double gs=bs+da+hra;
		System.out.println("Gross Salary is Rs."+gs);
		
	}

}
