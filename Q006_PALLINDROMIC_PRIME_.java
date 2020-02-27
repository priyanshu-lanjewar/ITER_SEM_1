
public class Q006_PALLINDROMIC_PRIME_ {

	public static void main(String[] args) {
		int i=0;
		for(int k=2;i<=100;k++)
			{
			if(Q005_PRIME_NO_.isPrime(k)&&Q003_REVERSE_OF_NO_.isPalindrome(k))
			{
  				System.out.print("\t"+k);
				i++;
				if(i%10==0)
					System.out.println();
			}
			
			

	}
System.out.println("done");
}
}
