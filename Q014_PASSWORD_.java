import java.util.Scanner;
public class Q014_PASSWORD_
{
	public static String password(String pass)
	{
		String res="	Valid"; int count=0;
		if(pass.length()<8) res="Invalid";
		for(int i=0;i<pass.length();i++)
		{
			if((pass.charAt(i)>=0&&pass.charAt(i)<=47)&&(pass.charAt(i)>=58&&pass.charAt(i)<=64)&&(pass.charAt(i)>=91&&pass.charAt(i)<=96)&&(pass.charAt(i)>=123&&pass.charAt(i)<=127))
			res="Invalid";
			if((pass.charAt(i)>='0'&&pass.charAt(i)<='9'))count++;
			
		}
		if(count<2)res="Invalid";
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Your Password : ");
		String pass=sc.next();
		String opt=Q014_PASSWORD_.password(pass);
		System.out.print("The password Is "+opt);
	}
}
