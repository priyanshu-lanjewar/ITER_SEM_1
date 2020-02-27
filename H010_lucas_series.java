import java.util.Scanner;
public class H010_lucas_series
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No of terms To Print : ");
        int n=sc.nextInt();
        int t1=1;
        int t2=3;
        int tn;
        if(n==1)
        System.out.print(" "+t1+" ");
        else if(n==2)
        {System.out.print(" "+t1+" ");
        System.out.print(" "+t2+" ");}
        else{System.out.print(" "+t1+" ");
        System.out.print(" "+t2+" ");
        for(int i=3;i<=n;i++)
        {
            tn=t1+t2;
            t1=t2;
            t2=tn;
            System.out.print(" "+tn+" ");
        }
    }
    }
    }
