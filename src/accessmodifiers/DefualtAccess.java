package accessmodifiers;

public class DefualtAccess {
	public static void main(String[]args)
	{
		Daccess obj= new Daccess();
		obj.fun();	
	}
}

class Daccess
{
	void fun()
	{
		int i=20;
		int j=30;
		int sum=i+j;
		System.out.println("Sum is:"+sum);
	}
}

/* When any data member or function declared without any kinds of modifies then it is 
 * known as defualt modifier. defualt modifier can be accessed only anywhere in the same package*/
 