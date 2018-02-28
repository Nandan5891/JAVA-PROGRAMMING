/* It is not mandatory for the coder to write a constructor for the class
  (2) A constructor is a special method that is used to initialize a newly created
  object and is called implicitly just after the memory is allocated for the object */
package constructor;

public class Constructor1 {
	
		public static void main(String[]args)
		{
			new ram();
			new ram(1,2);
		}
	}

class ram
{
	ram()
	{
		System.out.println("This is first constructor");	
	}
	ram(int i, int j)
	{
	System.out.println("This is first Parameterized constructor");		
	}
}
/* constructor is member function
 * the name of constructor is same as the class name
 * constructor doen't return value and used for initialization of value
 * when object is created for class then constructor is automatically created which is known 
 * as defualt constructor which is created by compiler  */
