package accessmodifiers;

public class ProtectedAccess {
	public static void main(String []args)
	{
		child obj= new child();
		obj.display();
		obj.ChidFun();
	}
}

class prtaccess
{
	protected int i=10;
	protected int j=20;
	public void display()
	{
	System.out.println("Value of i is: " +i);	
	System.out.println("Value of j is: " +j);	
	}

}
class child extends prtaccess  //Protected member can be access after the inherit where member is declared as protected.
{
	public void ChidFun()
	{
	int sum;
	sum=i+j;
	System.out.println("Sum is: "+sum);
	}
}

