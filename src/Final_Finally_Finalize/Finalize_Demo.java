package Final_Finally_Finalize;

public class Finalize_Demo {


	public static void main(String[] args) throws Throwable {

		first obj= new first();
		obj.finalize();
	}
}

class first
{
	protected void finalize() throws Throwable
	{
		try
		{
		System.out.println("Finalize sub class");
		}
		catch(Throwable t)
		{throw t;}
		finally
		{
			System.out.println("Calling finalize of super class");
			super.finalize();
		}
	}
}

