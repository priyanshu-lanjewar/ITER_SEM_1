import java.util.Scanner;
public class Q10multiplacation_table {

	public static void main(String[] args) {
		Scanner no=new Scanner(System.in);
		System.out.print("Enter A No : ");
		int t=no.nextInt();
		int time=1;
		for(;time<=10;time++)
		{
			System.out.println(t+" x "+time+" = "+(t*time));
		}

	}

}
