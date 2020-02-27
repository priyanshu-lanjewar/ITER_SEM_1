import java.util.Scanner;
public class Q13navshesh {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter A no :");
		int q,r,sum=0;;
		int number=input.nextInt();
		q=number/1;
			while(q!=0)
			{
				r=q%10;
				q=q/10;
				sum=sum+r;
				System.out.print(r);
			}
			System.out.println();
			if(sum%9==0) {
				System.out.println(number + " Divisible By 9");
			}
			else
				System.out.println(number +" Not Divisible By 9");
		
	}

}
