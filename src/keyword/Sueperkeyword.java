/* According to function overriding child class hides the parent class member and when we create
 an object for child class then we can access only child class member function as parent class
 member has already been hide but with the help of "super" keyword in child class function we can
 access the parent class member.
 (1) it avoids name conflict between member variables of parent class and child class
  */

package keyword;

public class Sueperkeyword {
	public static void main(String []args)
	{
		Child obj= new Child();
		obj.fun1();
	}
}

class SuperAccess
{
	int x;
	public void fun1()
	{
	System.out.println("I am Parent/Super class function");	
	}
}

class Child extends SuperAccess
{
	int y;
	public void fun1() // Function overriding
	{
	System.out.println("I am Child Class Function");
	super.fun1();	
	}
}