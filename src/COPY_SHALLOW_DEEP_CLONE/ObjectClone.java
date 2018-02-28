package COPY_SHALLOW_DEEP_CLONE;
import java.lang.*;
import java.util.Scanner;
public class ObjectClone {

	/**
	 * Object cloning is a process to create an exact copy of existing Object.
	 * for this we must implements cloneable interface which is defined in java.lang.Object.
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		System.out.println("Enter the id");
		String empid=sc.nextLine();
		
		employee obj= new employee(name, empid);
		
		System.out.println("======Display from Original Object=========");
		System.out.println(obj);
		System.out.println("Hashcode of Orginal object is:: "+obj.hashCode());

		employee obj1=obj.clone(); // Cloning Object
		
		System.out.println("========Display from Cloned Object========");
		System.out.println(obj1);
		System.out.println("Hashcode of Cloned Object is:: "+obj1.hashCode());
	}
}
class employee implements Cloneable
{
	String name, id;

	employee(String name, String id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return "name=" + name + "\nid="+id;	
	}
	public employee clone() throws CloneNotSupportedException
	{
		return(employee)super.clone();
	}
}
