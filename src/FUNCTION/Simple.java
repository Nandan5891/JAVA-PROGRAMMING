package FUNCTION;


public class Simple {

	public static void main(String []args)
	{
		Test obj= new Test();
		obj.setdata(20, 30, 40);
		obj.getdata();
	}
};
class Test
{
	private int length, breadth, height;
	public void setdata(int l, int b, int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	public void getdata()
	{
		System.out.println("Length is:" +length);
		System.out.println("Breadth is:" +breadth);
		System.out.println("Height is:" +height);
	}
}
