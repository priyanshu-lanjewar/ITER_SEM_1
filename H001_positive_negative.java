import java.util.Scanner;
public class H001_positive_negative
{
   public static void main(String []Args)
   {
       Scanner sc= new Scanner(System.in);
       int n0 ,count=0,positive=0,negative=0;
       System.out.print("Enter No of terms: ");
       n0=sc.nextInt();
	System.out.print("Enter NoS :  ");
       for(;n0!=0;n0--)
       {
	       int n=sc.nextInt();
           
	       if(n==0){break;}
           else if(n>0)
           positive++;
           else
           negative++;
           
        }

        System.out.println("Total no of Positives is "+positive);
        System.out.println("Total no of Negatives is "+negative);
    }
}
