/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-13
 * Description :a java program that prompts the user to enter the month and year and displays the
				number of days in the month. For example, if the user entered month 2 and year 2012, the
				program should display that February 2012 had 29 days. If the user entered month 3 and
				year 2015, the program should display that March 2015 had 31 days.
 */
import java.util.Scanner;
public class No_of_days_in_month$$ {

	public static void main(String[] args) {
		Scanner O=new Scanner(System.in);
		System.out.print("Enter Month (1-12) :");
		int month =O.nextInt();
		System.out.print("Enter Year :");
		int year=O.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			int i=month;
			switch(i)
			{
			case 1:
				System.out.println("January "+year+" has 31 days");
				break;
			case 3:
				System.out.println("March "+year+" has 31 days");
				break;
			case 5:
				System.out.println("May "+year+" has 31 days");
				break;
			case 7:
				System.out.println("July "+year+" has 31 days");
				break;
			case 8:
				System.out.println("August "+year+" has 31 days");
				break;
			case 10:
				System.out.println("Octomber "+year+" has 31 days");
				break;
			case 12:
				System.out.println("December "+year+" has 31 days");
				break;
			}
		}
		else if(month==4||month==6||month==9||month==11)
		{
			int i=month;
			switch(i)
			{
			case 4:
				System.out.println("April "+year+" has 30 days");
				break;
			case 6:
				System.out.println("June "+year+" has 30 days");
				break;
			case 9:
				System.out.println("September "+year+" has 30 days");
				break;
			case 11:
				System.out.println("November "+year+" has 30 days");
				break;
			}
		}
		else if(month==2)
		{
			if((year%100!=0)&&(year%4==0||year%400==0))
			{
				System.out.println("February "+year+" has 29 days");
			}
			else
			{
				System.out.println("February "+year+" has 28 days");
			}
		}
		else
		{
			System.out.println("!!!!!!...Entered Character is either \"NOT A NUMBER\" or it is not in range 0-12 for month..");
		}

	}

}
