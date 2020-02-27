import java.util.Scanner;

public class Q001_SIMPLE_CALCULATOR_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nThis is a Simple Calculator that can perform operation like addition,substraction,multiplication,division(returns Quetiont or remainder) and finding square root.\nPlease input ( Symbol inside braces ) to perform desired operation....\n (+) for Addition\n (-) for Substraction\n (x) for Multiplication\n(/q) for Division to get quetiont\n(/r) for Division to get remainder \n (#) for Square root ");
        String oper = sc.nextLine();
        int opt = 0;
        int num1 = 0;
        int num2 = 0;
        switch (oper) {
        case "+":
            System.out.print("Enter Number 1 : ");
            num1 = sc.nextInt();
            System.out.print("Enter Number 2 : ");
            num2 = sc.nextInt();
            opt = Q001_SIMPLE_CALCULATOR_.additionSimple(num1, num2);
            System.out.println("Addition = " + opt);
            break;
        case "-":
            System.out.print("Enter Number 1 : ");
            num1 = sc.nextInt();
            System.out.print("Enter Number 2 : ");
            num2 = sc.nextInt();
            opt = Q001_SIMPLE_CALCULATOR_.subtractionSimple(num1, num2);
            System.out.println("Substraction = " + opt);
            break;
        case "x":
        case "X":
            System.out.print("Enter Number 1 : ");
            num1 = sc.nextInt();
            System.out.print("Enter Number 2 : ");
            num2 = sc.nextInt();
            opt = Q001_SIMPLE_CALCULATOR_.multiplicationSimple(num1, num2);
            System.out.println("Multiplication = " + opt);
            break;
        case "/q":
            System.out.print("Enter Number 1 : ");
            num1 = sc.nextInt();
            System.out.print("Enter Number 2 : ");
            num2 = sc.nextInt();
            double ans = Q001_SIMPLE_CALCULATOR_.divisionSimple(num1, num2);
            System.out.println("Division (returns Quetiont) = " + ans);
            break;
        case "/r":
            System.out.print("Enter Number 1 : ");
            num1 = sc.nextInt();
            System.out.print("Enter Number 2 : ");
            num2 = sc.nextInt();
            opt = Q001_SIMPLE_CALCULATOR_.remainderSimple(num1, num2);
            System.out.println("Division (returns remainder)  = " + opt);
            break;
        case "#":

            System.out.println("Enter number to find Square root : ");
            double no = sc.nextDouble();
            double anss = Q001_SIMPLE_CALCULATOR_.squareRootSimple(no);
            System.out.println("Square root of number is " + anss);
            break;
        }
    }

    public static int additionSimple(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int subtractionSimple(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public static int multiplicationSimple(int x, int y) {
        int mul = x * y;
        return mul;
    }

    public static int remainderSimple(int n, int m) {
        int rem = n % m;
        return rem;
    }

    public static double divisionSimple(double x, double y) {
        double que = x / y;
        return que;
    }

    public static double squareRootSimple(double n) {
        double root = Math.sqrt(n);
        return root;
    }
}
