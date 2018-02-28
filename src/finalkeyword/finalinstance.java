/* After the declaration as final the variable must be initialized means it can not be blank 
 and after the initializatioin the value of final variable can not be changed */
package finalkeyword;

public class finalinstance {
	public static void main(String []args)
	{
	FinInstance obj= new FinInstance();
	obj.fun();
	}
}
class FinInstance
{
	final int i=12; // Final instance variable. the value of i can not be altered like i=i+1(not possible)
	
	public void fun()
	{
	System.out.println("Final Value i is:"+i);
	}
	
}

//Final instance member variable
// final static member variable.
//final local variable.
//final class := This class can not be inherited.
//final method : this method can not be overriden