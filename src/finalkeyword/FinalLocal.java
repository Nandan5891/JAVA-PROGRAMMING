package finalkeyword;

public class FinalLocal {
	public static void main(String []args)
	{
		Flocal obj= new Flocal();
		obj.fun();
	}
}
class Flocal
{
	public void fun()
	{
	final int i=12;	  // Final Local variable
	System.out.println("Value of Final Local is: "+i);
	}
}
// Local variable or final local variable must be initialized otherwise it will produce error 
// Instance member variable without initialization it will produce bydefault 0 value;
// Initializatioin of instance member variable is not compulsory.
//After the declartion of final variable either it may be local, instance, static it must be initialize
// WE can not change the value of final instance, final static and final local variable.