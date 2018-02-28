package accessmodifiers;

public class PrivateAccess3 {
	public static void main(String []args)
	{
	pvt3 obj= new pvt3();
	obj.SetDimension(11, 22, 33);
	obj.GetDimension();
	}
}

class pvt3
{
private int length, breadth, height;
	public void SetDimension(int l, int b, int h)
	{
	length=l;
	breadth=b;
	height=h;
	}
	public void GetDimension()
	{
	System.out.println("Length is:" +length);
	System.out.println("Breadth is:" +breadth);
	System.out.println("Height is:" +height);
	
	}
}