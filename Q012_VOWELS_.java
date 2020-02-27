import java.util.Scanner;

public class Q012_VOWELS_
{
	public static int count(String str)
	{
		int count=0;
	          int len=str.length();
		
	          for(int i=1;i<=len;i++)
	          {
	                    if(str.charAt((i-1))=='a' || str.charAt((i-1))=='e' || str.charAt((i-1))=='i' || str.charAt((i-1))=='o' || str.charAt((i-1))=='u' || str.charAt((i-1))=='A' || str.charAt((i-1))=='E' || str.charAt((i-1))=='I' || str.charAt((i-1))=='O' || str.charAt((i-1))=='U')
	                    count++;
	          }
	          return count;
	}
	public static void main(String[] args)
	{
	          Scanner sc=new Scanner(System.in);
	          System.out.print("Enter String : ");
	          String str=sc.nextLine();
		System.out.print("No of Vowels = "+Q012_VOWELS_.count(str));
		System.out.println();
	
	}
}
