import java.util.Scanner;
public class H009_factorial_sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		System.out.print(n);
		int fact=1;
		int sum=1;
		
		for(int i=1;i<=n;i++)
		{
			int j=i;
			fact=1;
			for(;j!=0;j--)
			{
				fact=fact*j;
				
			}
			sum=sum+fact;
		}
		System.out.println("Sum = "+sum);
	}
}
