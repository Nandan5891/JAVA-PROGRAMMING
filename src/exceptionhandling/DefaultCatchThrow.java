package exceptionhandling;

public class DefaultCatchThrow {
	public static void main(String args[])
	{
	/*
	System.out.println("Exception Handling");
	System.out.println("Result is:"+ 3/0); // Default Catch Throw
	System.out.println("Error"); // It will not display as exception occured and program terminated
	*/
	String str1=null;
	System.out.println("First Line");
	System.out.println("String Length is: "+str1.length()); // Null pointer exception
	System.out.println("Last Line");
	}
}

/*
Here reference variable str1 contain null value so str1.length() gives NullpointerException as str1 
doesn't have any value. Exception will occur at compile time.
Java default throw catch terminates the program and further program will not be run
*/