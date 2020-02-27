
public class Q07average_random_no {

	public static void main(String[] numbers) {
		int n1=Integer.parseInt(numbers[0]);
		double sum=0;
		for(int x =1;x<=n1;x++)
		{
			double random =Math.random();
			sum=sum+random;
			System.out.println("Random number "+x+" => "+random);
		}
		double avg=(sum/n1);
		System.out.println("Average Of Random number is = "+avg);

	}

}
