package COPY_SHALLOW_DEEP_CLONE;

public class Shallow_Copy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		first obj= new first();
		first obj1=obj; // Shallow Copy

		System.out.println(obj1.i);
		System.out.println(obj1.j);

	}

}

class first
{
	int i=5;
	int j=6;
}