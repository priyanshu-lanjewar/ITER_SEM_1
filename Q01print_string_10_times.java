import java.util.Scanner;
public class Q01print_string_10_times {

	public static void main(String[] args) {
		Scanner Str=new Scanner(System.in);
		System.out.println("Enter A Message :");
		String message=Str.nextLine();
		int a=1;
		while(a<=10)
		{
			if(a==1) {
			System.out.println(a+"st "+message);
			a++;}
			else if(a==2){
				System.out.println(a+"nd "+message);
				a++;}
			else if(a==3){
				System.out.println(a+"rd "+message);
				a++;}
			else{
				System.out.println(a+"th "+message);
				a++;}
		}

	}

}
