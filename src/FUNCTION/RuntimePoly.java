package FUNCTION;

public class RuntimePoly {

	/** It is a process in which call to an overriden method is resolved at runtime rather than compile time.
	 * it is determined by JVM instead of Compiler
// When static method is overloaded then it is known as compile time polymorphism. it is handled by compiler
	 * @param args
	 */
	public static void main(String[] args) {

		Bike obj= new splender();
		obj.run();
		Bike obj1= new passionxpro();
		obj1.run();
	}
}

class Bike
{
	public void run()
	{
		System.out.println("It is a Bike Class");
	}
}

class splender extends Bike
{	
	public void run()
	{
		System.out.println("It is a splender class");
	}
}

class passionxpro extends Bike
{
	public void run()
	{
		System.out.println("It is a Passionxpro class");
	}	
}