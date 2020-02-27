import  java.util.Scanner;
public class H003_power_of_no
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of terms : ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.print("\t"+(int)Math.pow(2,i));
			
		}
	}
}
