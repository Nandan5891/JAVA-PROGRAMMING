package FUNCTION;

import java.util.Scanner;

public class NoArgRetValue {
	public static void main(String args[])
	{
		Rectangle2 obj= new Rectangle2();
		int A;
		A=obj.AreaRectangle();
		System.out.println("Area of Rectangle is:"+A);
	}

}

class Rectangle2
{
	public int AreaRectangle()
	{
		int length,breadth,area;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		length=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle");
		breadth=sc.nextInt();
		area=length*breadth;
		return area;
	}

}