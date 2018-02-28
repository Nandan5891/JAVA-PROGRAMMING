package abstractconcept;

public class AbstractClass2 {
	public static void main(String args[])
	{
	Cuboid obj= new Cuboid();
	Rectangle obj2= new Rectangle();
	obj2.AreaRectangle();
	obj.CoboidVolume();
	}
}
abstract class Box
{
int length=12;
int breadth=13;
}
class Cuboid extends Box
{
	public void CoboidVolume()
	{
	int height=14;
	int volume=0;
	volume=length*breadth*height;
	System.out.println("Volume of Cuboid is:"+volume);
	}
}
class Rectangle extends Box
{
int Area;
	public void AreaRectangle()
	{
		Area=length*breadth;
		System.out.println("Area of Rectangle is:"+Area);
	}
}
