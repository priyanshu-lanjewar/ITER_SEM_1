
public class Q11sum_difference {

	public static void main(String[] args) {
		double n=1;
		int sumsq=0;
		int sqsum=0;
		int sum=0;
		for(;n<=100;n++)
		{
			int a=(int)Math.pow(n, 2);
			sumsq=sumsq+a;
			
		}
		for(int k=1;k<=100;k++)
		{
			sum=sum+k;
		}
		sqsum=(int)Math.pow(sum, 2);
			System.out.println("The sum of the square of the first 100 natural numbers is,"+sumsq);
			System.out.println("The square of the sum of the first 100 natural numbers is,"+sqsum);
			System.out.println("Hence the difference between the sum of the squares of the first\n" + 
					"ten natural numbers and the square of the sum is\n"+sqsum+" - "+sumsq+" = "+(sqsum-sumsq));
	}

}
