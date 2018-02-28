package inheritance;

public class Multilevel {
	public static void main(String []args)
	{
		Cylinder obj= new Cylinder();
		obj.VolumeCyboid();
		obj.CylinderVolume();
	}
}
class Box
{
int length=10, breadth=20;	
}
class Cuboid extends Box
{
	int height=5;
	public void VolumeCyboid()
	{
	 int volume=length*breadth*height;
	 System.out.println("Volume is:"+volume);
	}
}
class Cylinder extends Cuboid// Multilevel Inheritance
{
	public void CylinderVolume()
	{
		double volume;
		int r=5;
		volume=3.14*r*r*height;
		System.out.println("Volume of Cylinder is:"+volume);
	}
}
