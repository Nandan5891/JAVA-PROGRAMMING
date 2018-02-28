package constructor;

public  class Employee {
	
	public static void main(String []args)
	{
		Demo obj=Demo.getDemoInstance();
		
	}
	
}

class Demo
{
	private Demo()
	{
		System.out.println("Construction");
	}

	public static Demo getDemoInstance()   // Static Factory Method.
	{
		return new Demo();
	}	
}


// Factory method is used to create a private constructor class object from another class.
// Without factory method we can't create an instance of private constructor class as it is access only within class.'

