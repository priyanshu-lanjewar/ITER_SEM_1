/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-14
 * Description :
 */
import java.util.Scanner;
public class Scissor_paper_rock 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int random = (int)(Math.random()*(2-0+1));
		System.out.println("(0) FOR SCISSOR");
		System.out.println("(1) FOR ROCK");
		System.out.println("(2) FOR PAPER");
		System.out.println("ENTER YOUR INPUT:");
		int user_input=input.nextInt();
		if(random==0)
		{
			if(user_input==1)
			{
				System.out.println("Computer is Scissor And You are Rock. You Won!!");
			}
			else if(user_input==2)
			{
				System.out.println("Computer is Scissor And You are Paper. You Lost!!");
			}
			else
			{
				System.out.println("Computer is Scissor And You are Scissor. It Is A Draw!!");
			}
		}
		else if(random==1)
		{
			if(user_input==0)
			{
				System.out.println("Computer is Rock And You are Scissor. You Lost!!");
			}
			else if(user_input==2)
			{
				System.out.println("Computer is Rock And You are Paper. You Won!!");
			}
			else
			{
				System.out.println("Computer is Rock And You are Rock. It Is A Draw!!");
			}
			
		}
		else if(random==2)
		{
			if(user_input==0)
			{
				System.out.println("Computer is Paper And You are Scissor. You Won!!");
			}
			else if(user_input==1)
			{
				System.out.println("Computer is Paper And You are Rock. You Lost!!");
			}
			else
			{
				System.out.println("Computer is Paper And You are Paper. It Is A Draw!!");
			}
		}
		else
		{
			System.out.println("Input Error");
		}

	}

}
