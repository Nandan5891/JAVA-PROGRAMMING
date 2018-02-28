package keyword;

public class ThisTest {
	public static void main(String []args)
	{
		Test obj= new Test();
		obj.SetDimension(10,20,30);
		obj.GetDimension();
	} 
}

class Test
{
	private int l,b,h;
	public void SetDimension(int l, int b, int h)
	{
	this.l=l;
	this.b=b;
	this.h=h;
	}
	public void GetDimension()
	{
	System.out.println("Length is: " +l);
	System.out.println("Breadth is:" +b);
	System.out.println("Height is:  "+h);
		
	}
}