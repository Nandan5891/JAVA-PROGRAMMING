package staticmember;

public class StaticInheritance {
	public static void main(String[]args)
	{
	ChildClass obj= new ChildClass();
			obj.fun2();
			obj.fun();
	}
}
class ParentClass
{
	public static void fun()
	{
		System.out.println("I am Parent class Static Function");
	}
}
class ChildClass extends ParentClass // Childclass is inheriting the static member function
{
public void fun2()
	{
	System.out.println("I am ChildClass memberFunction");
	}
}
/* If we want to inherit the parent class static member function then functioin of childclass
 defined with different name
 (1)if child class function is  as parent class(public static void fun) in this case child
 class is hiding the parent class
 (2)if instance member function in parent class and child class also have the same function
 with same signature in this condition child class is overriding the parent class
 
 */
 