import java.util.Scanner;
public class H006_factorial_no
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter A Number : ");
		double no=sc.nextInt();
		for(int i=1;;i++)
		{
			no=no/i;
			if(no>(int)no)
			{
				System.out.println("Entered No. is not a factorial !");
				break;
			}
			if(no==1)
			{
				System.out.println("the number is factorial of  "+i);
				break;
			}
		}
	}
}