import java.util.Scanner;
public class H015_sum_of_digit
{
	public static void main(String []args)
	{
		Scanner  sc=new Scanner (System.in);
		System.out.println("Enter an Integer : ");
		int n=sc.nextInt();
		String no="";
		no=no+n;
		int sum=0;
		int len=no.length();
		for(int i=0;i<len;i++)
		{   
			int r=n%10;
			sum=(int)sum+r;
			n=n/10;
		}
			System.out.println("Sum is "+sum);
		
	}
}
