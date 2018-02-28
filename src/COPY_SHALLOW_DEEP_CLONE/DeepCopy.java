package COPY_SHALLOW_DEEP_CLONE;

public class DeepCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A obj= new A();
		obj.i=5;
		obj.j=10;

		A obj1= new A();
		obj1.i=obj.i; // Deep Copy
		obj1.j=obj.j;

		System.out.println(obj1.i);
		System.out.println(obj1.j);
	}

}
class A
{
	int i;
	int j;
}