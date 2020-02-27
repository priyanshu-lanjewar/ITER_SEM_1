import java.util.Scanner;
public class Q14power_2 {

	public static void main(String[] args) {
		Scanner N=new Scanner (System.in);
		System.out.print("Enter Value Of N : ");
		int n=N.nextInt();
		int power=0;
		while(n>1)
		{
			n=n/2;
			power++;
			
		}
		System.out.println(power);
	}

}
