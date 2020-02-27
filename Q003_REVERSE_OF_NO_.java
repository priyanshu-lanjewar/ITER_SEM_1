import java.util.Scanner;
public class Q003_REVERSE_OF_NO_ {
	public static int reverse(int number)
	{
		String rev="";
		while(number!=0)
		{
			int r=number%10;
			number=number/10;
			rev=rev+r;
		}
		int ans=Integer.parseInt(rev);
		return ans;
	}
	public static boolean isPalindrome(int number)
	{
		int a=number;
		int b=Q003_REVERSE_OF_NO_.reverse(a);
		boolean c=(a==b);
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in)
				;
		System.out.println("Enetr a Number : ");
		int inp=sc.nextInt();
		boolean op1=Q003_REVERSE_OF_NO_.isPalindrome(inp);
		System.out.println("NUMBER IS PALLINDROME "+op1);

	}

}
