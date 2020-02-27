import java.util.Scanner;
public class Q011_STRING_FREQ_
{
	public static int count(String str, char a)
	{
		int count=0;
		 int len=str.length();
		 for(int i=1;i<=len;i++)
		 {
			 if(str.charAt((i-1))==a)
			 count++;
		 }
		 return count;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		System.out.print("Enter Character To Search : ");
		char a = sc.next().charAt(0);
		int ans=Q011_STRING_FREQ_.count(str, a);
		System.out.print("Frequency of "+a+" is "+ans);
	}
}
