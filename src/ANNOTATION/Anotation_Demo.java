package ANNOTATION;

import java.util.ArrayList;

import javax.management.MXBean;

public class Anotation_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		B obj= new B();
		obj.show();

		A obj1= new A();
		obj1.fun();
	}

}

@interface abc  // It allows only primitive type function
{
String disp();	
int disp1();
}

class A
{
	@Deprecated // this annoation tells programmer to don't use this method but it should be available
	public void fun()
	{
		System.out.println("Fun Function of Class A");
	}

	public void show()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	@Override   // It forces to override the method. if function doesn't override then error occured
	public void show()
	{
		System.out.println("Class B");
	}

	
	@SuppressWarnings("unchecked")
	public void list()
	{
		@SuppressWarnings("rawtypes") // It will remove the warning orange color icon notation
		ArrayList arr= new ArrayList();
		arr.add("Ram");
		arr.add(123);
		System.out.println(arr);
	}
}

