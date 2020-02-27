import java.util.Scanner;
public class H008_multiplication_by_addition
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		      int num1=sc.nextInt();
		      System.out.println("Enter Number 2 : ");
		      int num2=sc.nextInt();
		      int pro=0;
		      if(num1==0||num2==0){}
		      else if(num1>num2)
		      {
			      for(;num2!=0;num2--)
			      pro=pro+num1;
		      }
		      else
		      {
			      for(;num1!=0;num1--)
			      pro=pro+num2;
		      }
		      System.out.println("Product Of Number Is = "+pro);
	}
}
