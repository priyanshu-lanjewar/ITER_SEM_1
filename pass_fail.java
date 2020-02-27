/*
 * Name : Priyanshu Wasudeo Lanjewar
 * Registration No. 1941012603
 * Section : CSE - F
 * Assignment / Question : Assignment-3/Que-2
 * Description : a java program to input the mark of a student and check if the student mark is greater than or equal to 40, then it generates the following message.
                 “Congratulation! You have passed the exam.” Otherwise the output message is “Sorry! You have failed the exam.”
 */
import java.util.Scanner;
public class pass_fail {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int Marks=m.nextInt();
		if(Marks>=40)
		System.out.println("Congratulations ! You have passed the Exam.");
		else
		System.out.println("Sorry! You Failed the Exam");

	}

}
