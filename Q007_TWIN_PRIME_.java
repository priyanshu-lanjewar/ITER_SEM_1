
public class Q007_TWIN_PRIME_ {

	public static void main(String[] args) {
		int i=3;int i1=0;int i2=0;
		for(;i+2<=1000;i++)
		{
			 {
			if(Q005_PRIME_NO_.isPrime(i+2)==true && Q005_PRIME_NO_.isPrime(i)==true) {i2=(i+2);i1=i;
			
			
			if(i2-i1==2)
				System.out.println("("+i1+","+i2+")");}
			
		}

	}

	}}
