import java.util.Scanner;
public class Q008_AREA_ {
	public static double area(int n, double side)
	{
		double area;
		area=((n*side*side)/(4*(Math.tan((Math.PI)/n))));
		return area;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number Of Sides Of Polygon : ");
		int n= sc.nextInt();
		System.out.println("Enter Length Of Sides : ");
		double s = sc.nextDouble();
		System.out.println("Area of polygon is "+Q009_AREA_.area(n, s));
		

	}

}
