import java.util.Scanner;
public class H018_divisors
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		for(int i=1;i<=(int)(n);i++)
		{
			if(n%i==0)
			{
				System.out.print(" "+i);
				
			}
			
		}
	}
}
