package addition;
import java.util.Scanner;
public class FirstAddition {
public static void main(String[]args)
	{
	int a,b,sum;
	System.out.println("Enter first number");
	Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("Enter the Second number");
	b=sc.nextInt();
	sum=a+b;
	System.out.println("The sum of two digit is:  " + sum);
	}
}
