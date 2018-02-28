package abstractconcept;

public class AbstractClass {
	public static void main(String[]args)
	{
		Student obj= new Student();
		obj.SetAge(20);
		obj.SetName("RamNandan");
		System.out.println("Age is:"+obj.GetAge());
		System.out.println("Name is:"+obj.GetName());
	}
}
abstract class Person
{
	private int age;
	private String name;
	public void SetAge(int A)
	{
		age=A;
	}
	public void SetName(String N)
	{
		name=N;
	}
	public int GetAge()
	{
		return age;
	}
	public String GetName()
	{
		return name;
	}
}
class Student extends Person
{

}

/* java abstract classes are used to declare common characteristic of subclass
 It can only be used as super class for other classes that extends the abstract class
 (3) like any other class an abstract class can contain fields that describe the characteristics 
 and methods that describe the action that a class can perform
 (4) Abstract classes are declared with the Abstract keyword
 (5) We can not create an object of an abstract class */
