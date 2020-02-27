
public class priyanshu
{
     public static int factorial(int num)
    {
        int fact=1;
        while(num!=0)
        {
            fact=fact*num;
            num--;
        }
        return fact;
    }
}