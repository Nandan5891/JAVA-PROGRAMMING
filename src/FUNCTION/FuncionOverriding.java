package FUNCTION;

public class FuncionOverriding {
	public static void main(String args[])
	{
		ggg obj= new ggg();
		obj.fun1();
		
	}
}

class fff
{
	public void fun1()
	{
		System.out.println("This is Base/Parent/Super Class");
	}
}

class ggg extends fff
{
	public void fun1() // Overriden function
	{
		super.fun1();
		System.out.println("This is Base Class");
	  // super keyword is used to access the parent class
	}
}

/* Creation of object of overriden function can only access the subclass member function. 
it hides the base class function.As we use super keyword in subclass then it allows to access
 the Base class or parent class  function.
*/
