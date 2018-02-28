package exceptionhandling;

public class OurThrowOurCatch {
	public static void main(String []args)
	{
	int balance=5000;
	int withdrawl=6000;
	try
		{
		if(balance<withdrawl)
		throw new ArithmeticException("Insufficient Balance");
		balance=balance-withdrawl;
		System.out.println("Transaction is Completed");
		}
	catch(ArithmeticException e)
		{
		System.out.println("Exception:"+e.getMessage());
		}
	System.out.println("Program will continue");
	}
}
