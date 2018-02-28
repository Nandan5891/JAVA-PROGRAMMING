package basic;

public class SwapWithoutNumber {
	public static void main(String []args)
	{
		int a=10,b=50;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping the Value is:");
		
		System.out.println("Value of A is: "+a);
		System.out.println("Value of B is: "+b);
		
	}
	
}
