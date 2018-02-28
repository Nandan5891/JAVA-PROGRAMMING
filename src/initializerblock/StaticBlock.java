package initializerblock;

public class StaticBlock 
{
	public static void main(String[]args)
	{
		First obj= new First();
		int j= First.k;
		System.out.println("Value of J is: "+j);
	}
}
class First
{
	public  static int k;
	static		// Static Initialization Block
	{
		System.out.println("Static Initiazation K is:"+k);
		k=10;
	}
}
/* A static initialization declared in a class is executed when the class is intiliazed
 (2) Static initializer may be used to initialize the class variable of the class
 (3) return keyword can not be used with 
 (4)This and super keyword can not be used in static block */

