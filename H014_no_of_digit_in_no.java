import java.util.Scanner;
public class H014_no_of_digit_in_no
{
	public static void main(String []args)
	{
		Scanner  sc=new Scanner (System.in);
		System.out.println("Enter an Integer : ");
		int n=sc.nextInt();
		String no="";
		no=no+n;
		int len=no.length();
		System.out.println("No of digit in integer is "+len);
			
		
	}
}
