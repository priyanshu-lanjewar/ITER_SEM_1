import java.util.Scanner;
public class H023_nth_fibonacci_term
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No of terms To Print : ");
        int n=sc.nextInt();
        int t1=0;
        int t2=1;
        int tn=0;
        if(n==1)
        System.out.print(" "+t1+" ");
        else if(n==2)
        {
        System.out.print(" "+t2+" ");}
        else{
        for(int i=3;i<=n;i++)
        {
            tn=t1+t2;
            t1=t2;
            t2=tn;
           
        }
	    System.out.print(" "+tn+" ");
    }
    }
    }
