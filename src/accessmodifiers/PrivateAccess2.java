package accessmodifiers;

public class PrivateAccess2 {
	public static void main(String []args)
	{
		prv obj= new prv();
		obj.display();	
		obj.get();
	}
}

class prv
{
	private int i=10;
	private int j=20;
	public void display()
	{
		System.out.println("Value of i is:" +i);
		System.out.println("Value of j is:" +j);
		
	}
	public void get()   // Private member can be accessed anywhere within the class and member function
	{
		int sum;
		sum=i+j;
		System.out.println("Sum is:"+sum);
	}

}