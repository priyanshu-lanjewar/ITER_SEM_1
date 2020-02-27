import java.util.Scanner;
public class Q005_PRIME_NO_ {
	public static boolean isPrime(int number) {
		int pro=0;
	
		
			for(int i=2;i<=Math.sqrt(number);i++)
			{
				if(number%i==0)
					pro++;
					
			}
			if(pro==0)
		return true;
			else return false;
	}
	
	public static void main(String[] args) {
		Scanner no=new Scanner(System.in);
		System.out.println("ENter a Number : ");
		int noo=no.nextInt();
		boolean k=Q005_PRIME_NO_.isPrime(noo);
		System.out.println("The Number iS Prime  : "+ k);
		
			
		
		

	}

}