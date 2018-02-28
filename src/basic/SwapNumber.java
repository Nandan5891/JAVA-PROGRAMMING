package basic;

public class SwapNumber {
	public static void main(String []args)
	{
		int a=10,b=50;
		int temp=0;
		temp=b;
		b=a;
		a=temp;
		System.out.println("After swapping the value of A and B is following:");
		System.out.println("The value of A is: " +a);
		System.out.println("The value of B is: " +b);
	}

}
