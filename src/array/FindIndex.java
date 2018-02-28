package array;
import java.util.*;
public class FindIndex {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		first obj= new first();
		obj.fun();
	}

}

class first
{

	public void fun() throws ClassNotFoundException
	{
		Class c=Class.forName("FindIndex");
		System.out.println(c.getName());
	}
}