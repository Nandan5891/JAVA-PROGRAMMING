/* in object oriented programming if the name of function is same but signatre is different then it is called function overloading. to achieve polymorphysim we use function overloading.
 It is compiled time polymorphysm
Function may be in same class with same name or it may be in subclass(child class) but important thing is that signature must be differ from other function,  */
package FUNCTION;

public class FunctionOverloading {
	public static void main(String []args)
	{
	 Second  obj= new Second ();
	 obj.fun();
	 obj.fun(1,2);
	 obj.fun(1,2,3);
	 obj.fun(1,2,3,4);
	}
}
class First
{
public void fun()
	{
	System.out.println("this is first function");
	}
public void fun(int i, int j)
	{
	System.out.println("this is second function");
	}
public void fun(int i, int j, int k)
	{
	System.out.println("This is third function");
	}
}

class Second extends First
{
	public void fun(int i, int j, int k, int l)
	{
	System.out.println("This is fourth function");	
	}
}