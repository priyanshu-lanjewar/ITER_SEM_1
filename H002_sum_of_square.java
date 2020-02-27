import java.util.Scanner;
public class H002_sum_of_square
{
   public static void main(String []Args)
   {
       Scanner sc= new Scanner(System.in);
       int n0 ,sum=0;
       System.out.print("Enter No of terms: ");
       n0=sc.nextInt();
	System.out.print("Enter NoS :  ");
       for(;n0!=0;n0--)
       {
	       int n=sc.nextInt();
           
	    sum=sum+(n*n);
        }
System.out.println("Sum of Square of Sequance is : "+sum);
   }
}
