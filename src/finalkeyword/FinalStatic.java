package finalkeyword;

public class FinalStatic {	
	public static void main(String []args)
	{
	Fstatic.display();		
	}
}

class Fstatic
{
private static final int i=10; // Final Static Instance variable
	
	public static void display()
		{
		System.out.println("Final Static Value I is: "+i);
		}
	}
/* Static member variable when qualified with final keyword, it becomes blank until intialized
it must be initialized. the value of final variable can not be altered
(1) Final static variable can be initialized during the declaration or within the static initializer */
