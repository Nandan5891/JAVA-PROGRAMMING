package addition;
import java.io.*;
public class ConsoleInput {
	public static void main(String []args) 
	{
		// TODO Auto-generated method stub

		Console cn=System.console();
		int num;
		System.out.println("Enter any number");
		num=Integer.parseInt(cn.readLine());

		System.out.println("The given number is:     "  +num);

	}

}
