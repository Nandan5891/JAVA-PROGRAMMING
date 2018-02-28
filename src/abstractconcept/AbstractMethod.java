package abstractconcept;

public class AbstractMethod {

	public static void main(String []args)
	{
	operation obj= new operation();
	obj.addition();
	obj.subtraction();
	obj.multiplication();
	obj.division();
	}
}
abstract class Calculation
{
	int i=50,j=25;
	abstract void addition();
	abstract void subtraction();
	abstract void multiplication();
	abstract void division();
}
 class operation extends Calculation
{
	void addition()
	{
		int sum=0;
		sum=i+j;
		System.out.println("Addition is:"+sum);
	}

	void subtraction() {
		int subtract;
		subtract=i-j;
		System.out.println("Subtraction is:"+subtract);
	}

	void multiplication() 
	{
		int mul;
		mul=i*j;
		System.out.println("Multiplication is:"+mul);
	}

	void division() 
	{
		int div;
		div=i/j;
		System.out.println("Division is:"+div);
	}
}

/* 
 An abstract class can be include methods that contain no implementation. these are called a
 abstract method. the abstract method declaration must then end with a semicolon ; rather than a block.
 (2) If a class has any abstract methods whether declared or inherited the entire class must be 
 declared as an abstract.
 (3) if there are two or more abstract function in parent abstract class then it forces to implementation
 of all abstract method in subclass otherwise it will produce error message
 (4) So we can say that abstract method is like a function which is created by team leader 
 and developer has to responsibility to implementation of all kinds of function which is declared
 by team lead or project lead.
 */
  