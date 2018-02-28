package inheritance;

public class Hierarchichal {
	public static void main(String[]args)
	{
		shape2 obj= new shape2();
		shape1 obj2= new shape1();
		obj2.RecArea();
		obj.CuboidVolume();		
	}
}

class shape
{
	int length=10,breadth=20,height=50;
}
class shape1 extends shape
{
public void RecArea()
	{
	int area;
	area=length*breadth;
	System.out.println("Area of Rectangle:"+area);
	}
}
class shape2 extends shape
{ 
public void CuboidVolume()
	{
	int volume;
	volume=length*breadth*height;
	System.out.println("Volume of Cylinder:"+volume);
	}
}
