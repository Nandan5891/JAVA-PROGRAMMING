// it avoids name conflict between member variables of parent class and child class

package keyword;

public class Super2 
{
	public static void main(String []args)
	{
		ChildClass obj= new ChildClass();
		obj.fun();
	}
}
class ParentClass
{
	int x;
	public void display()
	{	}
}
class ChildClass extends ParentClass
{
	int x;
	public void fun()
	{
		this.x=2;  // Here this keyword access only child member variable
		super.x=5; // Here super keyword access parent class member variable.
		// Here name of variable is same which is avoided by this keyword and super keyword.
		System.out.println("The value of x in Child class is :"+this.x);
		System.out.println("The value of x in Super class is:"+super.x);
	}
}