package FUNCTION;

public class StaticFunction {
	public static void main(String args[])
	{
	fun obj= new fun();
	obj.display();
	fun.abc(); // static function is called with the help of class name
	}
	
}
class fun
{
	int a=20,b=30;
	int sum;
	public void display()
	{
	sum=a+b;
	System.out.println("Sum is: "+sum);
	
	}	
	public static void abc()
	{
		int a=50,b=50;
		int sum;
		sum=a+b;
		System.out.println("Sum is:  "+sum);
	}
   
}
/* We can not declare local variable inside the function without static
 * it means we can declare local variable inside the static function
 * and we can not declare static variable inside the static function   */
 