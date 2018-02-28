package GENERICS_DEMO;

public class GenericsDemo 
{
	public static<E> void printarray(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Integer[]intarray={10,20,30,40,50};
		Character[]charray={'a','e','i','o','u'};
		System.out.println("Print Integer Array");
		printarray(intarray);
		System.out.println("Character Array");
		printarray(charray);
	}

}

