package accessmodifiers;

public class PublicAccess {
	public static void main(String []args)
	{
	B.display();  //Function calling using By its ClassName as it is a static
	B.get();
	}
}

class A
{
	public static int j=20;
	public static int k=30;
	public static void display() // Static Method
		{
		System.out.println("=====This is parent class======");
		System.out.println("Value of j is: " +j);
		System.out.println("Value of K is: " +k);
		
		}
}
class B extends A // Inherit class example
{
public static void get()
 	{
	System.out.println("=====This is Child Class======");
	int sum=0;
 	sum=j+k;
 	System.out.println("Sum is: "+sum);
 	}
}