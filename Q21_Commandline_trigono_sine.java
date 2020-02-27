/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-21
 * Description : a java program that takes a double value t from the command line and prints the value 
                 of sin (2t) + sin (3t)
 */
/*Write a java program that takes a double value t from the command line and prints the value
of sin (2t) + sin (3t).*/
public class Q21_Commandline_trigono_sine {

	public static void main(String[] args) {
		double t=Double.parseDouble(args [0]);
		double value = Math.sin(2*t)+Math.sin(3*t);
		System.out.println("value of t="+t);
		System.out.println("sin(2t)+sin(3t)="+value);

	}

}
