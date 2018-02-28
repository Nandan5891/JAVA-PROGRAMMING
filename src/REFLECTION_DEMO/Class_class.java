package REFLECTION_DEMO;

public class Class_class {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		Class c=Class.forName("REFLECTION_DEMO.Class_class");
		System.out.println(c.isInterface()); // it will return false
		System.out.println(c.getSuperclass());// it will return Object class as Class java.lang.Object
		
		Class c1=Class.forName("REFLECTION_DEMO.B");
		System.out.println(c1.getSuperclass()); // It will return Class A as Parent class	
	}
}

class A
{
	
}

class B extends A
{
	
}