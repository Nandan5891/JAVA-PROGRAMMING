package REFLECTION_DEMO;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Second_Example {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		employee obj= new employee(11,"RamNandan");
		obj.display();
		
		//Following codes are for inspection of class as constructor, method, fields and interface
		
		Class cls=Class.forName("REFLECTION_DEMO.employee");
		System.out.println("========================");
		Constructor[] ct=cls.getConstructors();
	
		System.out.println("Name of Constructor is: ");
		for(Constructor construct:ct)
		{
			System.out.println(construct);
		}
		System.out.println("========================");
		System.out.println("List of Methods are following");
		
		Method[] method=cls.getMethods();
		
		for(Method m:method)
		{
			System.out.println(m);
		}
		System.out.println("========================");
		System.out.println("List of Fields are following:");
		Field[] field=cls.getDeclaredFields();
		for(Field f:field)
		{
			System.out.println(f);
		}
		
	}

}

class employee
{

	private int empid;
	private String empName;

	employee(int empid, String empName) // CONSTRUCTOR DECLARATION
	{
		this.empid=empid;
		this.empName=empName;
	}

	public int getempid()
	{
		return empid;
	}
	public void setempid(int empid)
	{
		this.empid=empid;
	}
	public String getempname()
	{
		return empName;
	}
	public void setempname()
	{
		this.empName=empName;
	}

	public void display()
	{

		System.out.println("Empid is:   "+ empid +  "     "   +"Employee Name is  : "+ empName);
	}
}