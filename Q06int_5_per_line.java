
public class Q06int_5_per_line {

	public static void main(String[] args) {
		int x,y=1;
		for(x=1000;x<=2000;x++)
		{
			
			if(y<=5)
			{
				System.out.print(x+"\t");
				y++;
			}
			else
			{
				System.out.println();
				System.out.print(x+"\t");
				y=2;
			}
			
		}

	}

}
