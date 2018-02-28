package string;

public class SecondString {
	public static void main(String[]args)
	{
		SecondExample obj= new SecondExample();
		obj.display();
	}

}
class SecondExample
{
	public void display()
	{
		String s1="computer";
		String s2="computer";
		String s3=new String("computer");
		
		System.out.println("Result 1:" +(s1==s2)); // Comparing Reference value
		System.out.println("Result 2:" +s1.equals(s2));// Comparing String
		System.out.println("Result 3:"+(s1==s3));
		System.out.println("Result 4:"+s1.equals(s3));
		
	}
}