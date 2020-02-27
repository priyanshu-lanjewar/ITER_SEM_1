/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-17
 * Description :
 */
import java.util.Scanner;
public class Divisible_by_5_or_6 {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.print("Enter Integer : ");
		int no=o.nextInt();
		int a;
		boolean result_1=(no%5==0&&no%6==0);
		boolean result_2=(no%5==0||no%6==0);
		System.out.println(no + " divisible by 5 and 6  =>"+result_1);
		System.out.println(no + " divisible by 5 or 6 =>"+result_2);
		if(no%5==0)
		{
			if(no%6==0)
			{
				a=0;
			}
			else
			{
				a=1;
			}
		}
		else
		{
			if(no%6==0)
			{
				a=1;
			}
			else
			{
				a=1;
			}
		}
		boolean result_4=(a==1);
			
		
		System.out.println(no + " divisible by 5 or 6  but not by both =>"+result_4);

	}

}
