package constructor;

public class Constructorchaining {
	public static void main(String[]args)
	{
		CD obj= new CD();
	}
}
class AB
{
	public AB()
	{
		System.out.println("Class AB");
	}
}
class CD extends AB
{
	public CD()
	{
		this(1); // To access parameterized constuctor of child class
		System.out.println("Class CD");
	}
	public CD(int i)
	{
	super(); // To access super class
	System.out.println("Parameterized Constructor of Class CD");
	} 
 
}
/* (1) constructor can call other constructor of the same class or super class
 (2) constructor call from a constructor must be in the first line or step
 (3) such series of invocation of constructor is known as constructor chaining  */
 