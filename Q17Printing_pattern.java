public class Q17Printing_pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			
			for(int j=1;j<=10;j++)
			{
				if(j%i==0 ||i%j==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(i);
		}

	}

}
