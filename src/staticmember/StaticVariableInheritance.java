package staticmember;

public class StaticVariableInheritance {
	public static void main(String []args)
	{
	Second obj= new Second();
	obj.fun();
	}
}  
class First
{
static int i=5;	
}
class Second extends First
{
	public void fun()
	{
	int sum=0;
	int j=10;
	sum=i+j;
	System.out.println("Value of Sum is:"+sum);
	}
}