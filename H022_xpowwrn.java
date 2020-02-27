import  java.util.Scanner;
public class H022_xpowwrn
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x  : ");
		int x=sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.print("\t"+(int)Math.pow(x,i));
			
		}
	}
}
