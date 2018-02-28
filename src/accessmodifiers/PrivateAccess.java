package accessmodifiers;

public class PrivateAccess {
	public static void main(String []args)
	{

	}
}
class example
{
	private static int j=10;
	private static int k=30;
	public static void display() // Static Method
		{
		System.out.println("=====This is parent class======");
		System.out.println("Value of j is: " +j);
		System.out.println("Value of K is: " +k);	
		}
}
class First extends example   // Inherit class example
{
public static void get()
 	{
	System.out.println("=====This is Child Class======");
	int sum=0;    // Here Field (j and k) of Example is not visible as its declare as private
 	//sum=j+k;
 	System.out.println("Sum is: "+sum);
 	}
 }