import java.util.Scanner;
public class Q04count_from_by_to {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.print("Count From :");
		int from=number.nextInt();
		System.out.print("Count To :");
		int to=number.nextInt();
		System.out.print("Count by :");
		int by=number.nextInt();
		
		while(from<=to)
		{
			
			System.out.print(from+" ");
			from=from+by;
		}

	}

}
