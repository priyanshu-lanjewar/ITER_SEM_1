import java.util.Scanner;
public class H012_check_fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2 number : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int tn=1;
		if(n1>n2)
		{
			while(tn>0)
			{
				tn=n1-n2;
				n1=n2;
				n2=tn;
			}
			if(tn==0)System.out.println("They are the terms of fiboncci sequence .");
			else System.out.println("They are not the terms of fiboncci sequence .");
		}
		else 		if(n1<n2)
		{
			while(tn>0)
			{
				tn=n2-n1;
				n2=n1;
				n1=tn;
			}
			if(tn==0)System.out.println("They are the terms of fiboncci sequence .");
			else System.out.println("They are not the terms of fiboncci sequence .");
		}
		else if(n1==1 && n2==1)System.out.println("They are the terms of fiboncci sequence .");
	          else System.out.println("They are not the terms of fiboncci sequence .");
	}
}
