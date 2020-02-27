import java.util.Scanner;
public class H005_factorial_inverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n to compute 1/n!  , n = ");
		int n=sc.nextInt();	
		int fact=1;
		for(;n!=0;n--)
		fact=fact*n;
		System.out.println("value of 1/n! = "+(1/(double)fact));
	}
}
