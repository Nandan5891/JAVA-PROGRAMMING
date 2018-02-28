
package FUNCTION;
import java.util.Scanner;

public class ArgNoRetValue 
{
	public static void main(String []args)
	{
		int length,breadth;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		length=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle");
		breadth=sc.nextInt();

		Rectangle obj= new Rectangle();
		obj.AreaRectangle(length,breadth);
	}
	  
}

class Rectangle
{
	public void AreaRectangle(int l, int b)
	{
		int area;
		area=l*b;
		System.out.println("Area of Rectangle is:" + area);
	}
}