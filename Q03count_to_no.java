import java.util.Scanner;
public class Q03count_to_no {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.print("Count to :");
		int no=number.nextInt();
		int count=0;
		while(count<=no)
		{
			System.out.print(count+" ");
			count++;
		}

	}

}
