package accessmodifiers;

import java.lang.reflect.Method;


public class MethodPrivate
{

	public static void main(String []args) throws Exception
	{
				Class c= Class.forName("accessmodifiers.Employee");
				
				Employee emp=(Employee)c.newInstance();
				
				Method m=c.getDeclaredMethod("display", null);
				
				m.setAccessible(true);
				
				m.invoke(emp, null);
	}
}

class Employee
{
	private void display()
	{
		System.out.println("Private method");
	}

}