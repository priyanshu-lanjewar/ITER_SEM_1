/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-10
 * Description :a java program that prompts the user to enter an integer for today’s day of the week
				(Sunday is 0, Monday is 1... and Saturday is 6). Also prompt the user to enter the number
				of days after today for a future day and display the future day of the week.
 */
import java.util.Scanner;
public class Week_day {
public static void main(String[]args) {
	Scanner day=new Scanner(System.in);
	System.out.println("Enter todays day in number as ");
	System.out.println("0 for Sunday");
	System.out.println("1 for Monday");
	System.out.println("2 for Tuesday");
	System.out.println("3 for Wednesday");
	System.out.println("4 for Thursday");
	System.out.println("5 for Friday");
	System.out.println("6 for Saturday");
	System.out.print("_______________________>");
	int today=day.nextInt();
	

	System.out.println("Enter the number of days elapsed since today:");
	int days = day.nextInt();
	int x=(today+days)%7;
	switch(today)
	{
	case 1:
		System.out.println("Today is Monday");
		break;
	case 2:
		System.out.println("Today is tuesday");
		break;
	case 3:
		System.out.println("Today is Wednesday");
		break;
	case 4:
		System.out.println("Today is thursday");
		break;
	case 5:
		System.out.println("Today is friday");
		break;
	case 6:
		System.out.println("Today is saturday");
		break;
	case 0:
		System.out.println("Today is sunday");
		break;
		default:
			System.out.println("Wrong input");
			break;
	}
	switch(x)
	{
	case 1:
		System.out.println("Further day is Monday");
		break;
	case 2:
		System.out.println("Further day is tuesday");
		break;
	case 3:
		System.out.println("Further day is Wednesday");
		break;
	case 4:
		System.out.println("Further day is thursday");
		break;
	case 5:
		System.out.println("Further day is friday");
		break;
	case 6:
		System.out.println("Further day is saturday");
		break;
	case 0:
		System.out.println("Further day is sunday");
		break;
		default:
			System.out.println("Wrong input");
			break;
	}
}
}

