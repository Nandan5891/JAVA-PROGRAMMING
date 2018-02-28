package InnerClass;

public class InnerClassDemo2 {

	/** Accessing Static member with static innerclass
	 * @param args
	 * With the help of outer class refereces we can access the non static member witin static innerclass
	 */
	public static void main(String[] args)
	
	{
		First obj1= new First();
		obj1.obj.test1(obj1); // Passing reference of outerclass within Innerclass as obj1
		obj1.obj.test2(obj1);
	}
}

class First
{
	int j=25;
	static class Second
	{
		public static void test1(First x)
		{
			System.out.println("Static function value");
			System.out.println("The value of I is:    "+x.j);
			System.out.println("===========================");
			
		}
		public void test2(First x)
		{
			System.out.println("Non-Static function value");
			System.out.println("The value of I is:    "+x.j);
		}
	}
	Second obj= new Second(); // Create object for inner class
}

// Method of static inner class may be static or non static and both can be access the static member variable
// but non static member can not be access by method of static inner class (but with the reference of outer class its possible.)