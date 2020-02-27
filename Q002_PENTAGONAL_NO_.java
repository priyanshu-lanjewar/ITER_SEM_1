import java.util.Scanner;
public class Q002_PENTAGONAL_NO_ {
	public static int getPentagonalNumber(int n) {
	int no=n*(3*n-1)/2;
	return no;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in)
				;
		System.out.println("Enter no of terms");
		int k=sc.nextInt();
		for(int i=1;i<=k;i++)
		{
			System.out.print(" "+Q002_PENTAGONAL_NO_.getPentagonalNumber(i));
		}
	}

}
