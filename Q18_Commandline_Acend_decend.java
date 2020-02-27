/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-2/Que-18
 * Description :a java program that takes three double values x, y, and z as command-line arguments
                and prints true if the values are strictly ascending or descending (x < y < z or x > y > z),
                and false otherwise.
 */
public class Q18_Commandline_Acend_decend {

	public static void main(String[] numbers) {

		double n1=Double.parseDouble(numbers[0]);
		double n2=Double.parseDouble(numbers[1]);
		double n3=Double.parseDouble(numbers[2]);
		boolean result=(((n1<n2)&&(n2<n3))||((n3<n2)&&(n2<n1)));
		
		System.out.println(result);
		

	}

}
