
public class Q12n_operations {

	public static void main(String[] args) {
		int i=16;
		while(i<=2048)
		{
			double log_n = Math.log(i);
			double n =i;
			double n_log_n =n*log_n;
			double n_sq = Math.pow(n, 2);
			double n_cu = Math.pow(n, 3);
			double _pow_n = Math.pow(2, n);
					i=i*2;
			System.out.println(log_n+"\t"+n+"\t"+n_log_n+"\t"+n_sq+"\t"+n_cu+"\t"+_pow_n);
		}

	}

}
