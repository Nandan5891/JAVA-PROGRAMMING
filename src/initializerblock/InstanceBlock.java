package initializerblock;

public class InstanceBlock {
	public static void main(String []args)
	{
		instance obj= new instance();
		//instance obj1= new instance();
	}
}
class instance
{
int x;
int y;
{								  // Instance Initiazation Block
	System.out.println("Initialization value of X is:"+x);
	System.out.println("Initiazation Block Value of Y is:"+y);
	x=20;
	y=60;
}
public instance()     			//Constructor
	{
	System.out.println("Constructor X is:"+x);
	System.out.println("Constructor Y is:"+y);
	}
}

/*An instance initization block declared in a class is executed when an instance of class
  is created. return keyword can not be used with initializationi block
  Instance initializer are permitted to refer to the current object vice the keyword this and super 
*/
 