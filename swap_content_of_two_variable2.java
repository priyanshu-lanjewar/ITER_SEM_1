
public class swap_content_of_two_variable2
{

	public static void main(String[] args)
	{
		int a=30;
		int b=20;
		System.out.println("Before Execution:---------------------------------------------------------------");
		System.out.println("Value Of a = "+a);
		System.out.println("Value Of b = "+b);
		System.out.println();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Execution:----------------------------------------------------------------");
		System.out.println("Value Of a = "+a);
		System.out.println("Value Of b = "+b);
	}

}
