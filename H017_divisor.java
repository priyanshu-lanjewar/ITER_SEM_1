import java.util.Scanner;
public class H017_divisor
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println("Smallest divisior except 1 is "+i);
				break;
			}
			else if(i==(int)Math.sqrt(n)&&n%i!=0)
			{
			          System.out.println("Smallest divisior except 1 is "+n);
			          break;
			}
		}
	}
}
