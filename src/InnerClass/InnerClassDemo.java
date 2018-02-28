package InnerClass;

public class InnerClassDemo {

	/** Accessing Static member with static innerclass
	 * @param args
	 */
	public static void main(String[] args)
	
	{
		OuterFirst obj1= new OuterFirst();
		obj1.obj.test1(); // we can use Innerfirst.test1(); and no need to call with object.
		obj1.obj.test2();
	}
}

class OuterFirst
{
	static int i=20;
	int j=25;
	static class Innerfirst
	{
		public static void test1()
		{
			System.out.println("Static function value");
			System.out.println("The value of I is:    "+i);
			System.out.println("===========================");
			
		}
		public void test2()
		{
			System.out.println("Non-Static function value");
			System.out.println("The value of I is:    "+i);
			
		}

	}
	Innerfirst obj= new Innerfirst();  // Creation of object
}

// Method of static inner class may be static or non static and both can be access the static member variable
// but non static member can not be access by method of static inner class (but with the reference of outer class its possible.)