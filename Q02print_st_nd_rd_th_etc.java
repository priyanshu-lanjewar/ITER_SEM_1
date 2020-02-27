import java.util.Scanner;
public class Q02print_st_nd_rd_th_etc {

	public static void main(String[] args) {
		Scanner Str=new Scanner(System.in);
		System.out.println("Enter A Message :");
		String message=Str.nextLine();
		int a=1;
		while(a<1000)
		{
			if(a%10==1&&a%100!=11)
			{
				System.out.println(a+"st "+message);
			}
			else if(a%10==2&&a%100!=12)
			{
				System.out.println(a+"nd "+message);
			}
			else if(a%10==3&&a%100!=13)
			{
				System.out.println(a+"rd "+message);
			}
			else	{
				System.out.println(a+"th "+message);
			}
			a++;
		}

	}

}
