import java.util.Scanner;
public class Q013_STRING_PALLINDROME_
{
	public static boolean pallindrome(String stri)
	{
		int count=0;
		String str=stri.replace(" ", "");
		int len=str.length();
		
		boolean pall=true;
		
		{
			for(int i=1;i<=len/2;i++)
			{
				if(str.charAt((i-1))!=str.charAt(len-i)) {pall=false; break;}
			}
		}
		
	return pall;
	}		
	public static void main(String[] args)
	{
	          Scanner sc=new Scanner(System.in);
	          System.out.print("Enter String : ");
	          String str=sc.nextLine();
		boolean res=Q013_STRING_PALLINDROME_.pallindrome(str)
			;
		if(res==true)System.out.print("String is Pallindrome");
		else System.out.print("String is not  Pallindrome");
	}
}
