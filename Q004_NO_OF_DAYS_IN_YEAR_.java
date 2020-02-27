import java.util.Scanner;
public class Q004_NO_OF_DAYS_IN_YEAR_ {
	public static int numberOfDaysInAYear(int year)
	{
		if(year%4==0&&year%100!=0||year%400==0)
			return 366;
		else
			return 365;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year : ");
		int year=sc.nextInt();
		int no=Q004_NO_OF_DAYS_IN_YEAR_.numberOfDaysInAYear(year);
		System.out.println("No OF DAYS IN YEAR IS "+no);

	}

}
