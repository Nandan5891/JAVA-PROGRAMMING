package exceptionhandling;
// Runtime Exception is also known as Unchecked Exception
// This program is for Default throw and Our Catch
public class RunTimeException {
	public static void main(String []args)
	{
	try
		{
		//System.out.println("Result is:" +3/0); //ArithmeticException will catch an object of Try
		String s1=null;
		System.out.println("Length is:"+s1.length()); // NullPointerException will catch the object
		}
	catch(ArithmeticException e)
		{
		System.out.println("Exception"+e.getMessage());
		}
	catch(NullPointerException e)
		{
		System.out.println("Exception " +e.getMessage());
		}
	finally
		{
		System.out.println("I am the special content and definitely will display even exception occur");
		}
	}
}

/*
exception doen't effect the finally block. it will run anytime.
*/