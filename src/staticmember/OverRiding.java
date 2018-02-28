package staticmember;

public class OverRiding {
	public static void main(String[]args)
	{
		OverClass obj= new OverClass();
		obj.fun();	
	}
}
class OverClass
{
	public void fun()
	{
		System.out.println("I am parent class  function");
	}
}
class ChoverClass extends OverClass 
{
	public void fun() // Hiding the parent class as function is declare as static
	{
		System.out.println("I am child class  member functioin");
		super.fun(); // After overriding with super keyword we can access the parent class
	}
}
// Without static it is known as function is overriding and with static function is hiding.
// Non static member can be hiding the parent class. it will produce compile time error
//Child class static function can not hide non static(instance ) function of parent class (Compile Time error) 
/*
  If we want to inherit the parent class static member function then function of child class
 defined with different name
 (1)if child class function is  as parent class(public static void fun) in this case child
 class is hiding the parent class
 (2)if instance member function in parent class and child class also have the same function
 with same signature in this condition child class is overriding the parent class
 */


