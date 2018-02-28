package staticmember;

public class StaticHiding {
	public static void main(String[]args)
	{
	Chldclass obj2= new Chldclass();
	obj2.fun();
	}
}
class Pclass
{
	public static void fun()
	{
		System.out.println("I am parent class static function");
	}
}
class Chldclass extends Pclass 
{
	public static void fun() // Hiding the parent class as function is declare as static
	{
		System.out.println("I am child class static member functioin");
	}
}
/*
  If we want to inherit the parent class static member function then functioin of childclass
 defined with different name
 (1)if child class function is  as parent class(public static void fun) in this case child
 class is hiding the parent class
 (2)if instance member function in parent class and child class also have the same function
 with same signature in this condition child class is overriding the parent class
 */
