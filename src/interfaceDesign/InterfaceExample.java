package interfaceDesign;

public class InterfaceExample {
	public static void main(String[]args)
	{
		
	}
}
interface First
{
void someFunction();	
}
class Second implements First
{
	public void someFunction()
	{
		
		
	}

}

/* 
    (1) Interface definition begins with a keyword interface
  	(2) All members of interface is by default as public
  	(3)Interfaces just specify the method declaration (implicitly public and abstract) and can only contain
  	fields(which are implicitly public static final)
  	(4) Variable under interface is by default public, static and final
  	(5)An interface like that of an abstract class cannot be instantiated
  	(6)Interface do not have constructors.
  	
  	
 */
  