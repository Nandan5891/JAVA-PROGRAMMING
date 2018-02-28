/* To coversion of primitive data type into object and object into primitive data type is knonw
 * as wrapper class. it id divided into two parts Autoboxing(Primitive into Object) and 
 * Unboxing(Object into Primitive)*/
package wrapperclass;

public class WrapperClass {
	public static void main(String[]args)
	{
		// Boxing process using construtors
		Integer obj1= new Integer(123); //Boxing using internal constructor support
		Integer obj2= new Integer("124");
		
		//Boxing process using ValueOf Method
		
		Integer obj3= Integer.valueOf(125); // Boxing using valueof(static method)
		Integer obj4= Integer.valueOf(126);
		
		
		System.out.println("------After Boxing--------");
		System.out.println("Obj1--->"+obj1);
		System.out.println("Obj2--->"+obj2);
		System.out.println("Obj3--->"+obj3);
		System.out.println("Obj4--->"+obj4);
		
		System.out.println("------After UnBoxing--------");
		
		int a= obj1.intValue();
		String s1=obj2.toString();
		int b= obj3.intValue();
		String s2=obj4.toString();
		
		System.out.println("a="+a);
		System.out.println("S1="+s1);
		System.out.println("b="+b);
		System.out.println("S2="+s2);
		
		
	}
}
