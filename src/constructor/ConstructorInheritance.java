package constructor;

public class ConstructorInheritance {
	public static void main(String []args)
	{
		B obj = new B(); // constructor will call automatically after the creation of object.
	}
}
/*
class A
{
	public A() // Constructor of class A
	{
	System.out.println("I am Constructor of Class A");	
	}
}
class B extends A
{
	public B() // Child Class Constructor
	{
	// super(); // We can call parent constructor with super keyword explicitly.
	System.out.println("I am Child Class Constructor");	
	}
}
*/
/* Here constructor is not inherited means when we define child class constructor then child class
 constructor automatically call the parent class constructor after that child class constructor 
 invoke its own member. 
 (2) We can also invoke parent class constructor with the help of super() keyword but it must be
 define just after the declaration of child class constructor.
 (3) We mainly use super() keyword to pass the parameter to parent class constructor and if there
 is no parameterized constructor in parent class then child class implicitly call the parent class
 constructor or we can use simple super() keyword. for pass the parameter we have to writer like
 super(5)
 */
class A
{
	public A(int i) // Constructor of class A
	{
	System.out.println("Value of I is:"+i);	
	}
}
class B extends A  
{
	public B() // Child Class Constructor
	{
	super(5); // call the parent class constructor and pass the parameter
	System.out.println("I am Child Class Constructor");	
	}
}
