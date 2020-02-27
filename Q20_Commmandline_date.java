/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-20
 * Description :a java program that takes two int values m and d from the command line and prints
                true if day d of month m is between 3/20 and 6/20, false otherwise.
 */


public class Q20_Commmandline_date {

	public static void main(String[] args) {
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		boolean result =((m==3)&&(d<=31)&&(d>=20)) 	||((m==4)&&(d<=30)&&(d>=1))
		||((m==5)&&(d<=31)&&(d>=1))
		||((m==6)&&(d<=20)&&(d>=1));
	
		System.out.println(result);

	}

}
