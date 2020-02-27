import java.util.Scanner;
public class H019_gcd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number  1 : ");
		int a=sc.nextInt();
	          System.out.println("Enter number  2 : ");
	          int b=sc.nextInt();
		          while(a!=b) {
		              if(a>b)
		              a=a-b;
		              else
		              b=b-a;
		          }
		          System.out.println("GCD="+a);
		int max=0,min=0;String no="";
	        int j;
		for(int i=1;i<=(100);i++)
		{
			for( j=1;j<=i;j++)
			{
			if(i%j==0)
			{
				min++;
			}
				
			}
		          if(min>max)
		          {
		                    max=min;
				min=0;
		                    no=""+j;
		          }
			else if(min == max)
			{
				          max=min;
				          min=0;
				          no=no+" "+j;
				}
		}
		System.out.println("The number betwen 1 and 100 with higest number of Divisor "+no);
	}
}
