import java.util.Scanner;
public class H016_int_no
{
	public static void main(String []args)
	{
		Scanner  sc=new Scanner (System.in);
		System.out.println("Enter n (no of digits  : ");
		int n=sc.nextInt();
	String s="";
	System.out.println("Enter "+n+" no of integers ");
		for(int i=1;i<=n;i++)
		{   
		          int a=sc.nextInt();
			s=s+a;
		}
			int opt=Integer.parseInt(s);
			System.out.println("Integer = "+s);
		
	}
}
