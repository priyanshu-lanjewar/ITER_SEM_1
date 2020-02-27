import java.util.Scanner;
public class H011_sum_preceding_3_term
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No of terms To Print : ");
        int n=sc.nextInt();
        int t1=0;
        int t2=1;
        int t3=1;
        int tn;
        if(n==1)
        System.out.print(" "+t1+" ");
        else if(n==2)
        {System.out.print(" "+t1+" ");
        System.out.print(" "+t2+" ");}
        else if(n==3)
	        {System.out.print(" "+t1+" ");
	        System.out.print(" "+t2+" ");
	         System.out.print(" "+t3+" ");}
        else{System.out.print(" "+t1+" ");
        System.out.print(" "+t2+" ");
	    System.out.print(" "+t3+" ");
        for(int i=4;i<=n;i++)
        {
            tn=t1+t2+t3;
            t1=t2;
            t2=t3;
	        t3=tn;
            System.out.print(" "+tn+" ");
        }
    }
    }
    }
