package string;

public class FirstString {
	public static void main(String []args)
	{
		StringExample obj=new StringExample();
		obj.fun1();
		obj.fun2();
		}
}
class StringExample
{
	String str;
	public void fun1()
	{
		str="I am RamNandan";  // 
		System.out.println(str);
	}
	public void fun2()
	{
	String str1= new String(); // Here I have created an object of String Class 
	str1="I live at Rohini"; // str is a Reference variable containing the value of Object(I live at Rohini)
	System.out.println(str1);		
	}
}
/*
Here String is a Class and str is Reference variable.
String is a final Type class means we can not extends or inherit String class
It implies on Java.lang.String 
String is an Immutable class
Immutable means String in java, once created and initialized cannot be changed on the same reference.
*/
