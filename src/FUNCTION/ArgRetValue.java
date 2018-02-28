 package FUNCTION;

import java.util.Scanner;

public class ArgRetValue {
	public static void main(String []args)
	{
		int length,breadth;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		length=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle");
		breadth=sc.nextInt();
		
		Rectangle3 obj= new Rectangle3();
		int A;
		A=obj.AreaRectangle(length, breadth);
		System.out.println("Area of Rectangle is: "+A);
		
	}

}

class Rectangle3
{
	public int AreaRectangle(int l, int b)
	{
	int area;
	area=l*b;
	return area;
		
	}
}