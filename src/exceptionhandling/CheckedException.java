package exceptionhandling;

import java.io.IOException;

public class CheckedException {
	public static void main(String[]args)
	{
	try
		{
		throw new IOException();
		}
	catch(IOException e)
		{
		System.out.println("Exception:"+e.getMessage());
		}
	}
}
