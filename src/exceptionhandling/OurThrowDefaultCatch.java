package exceptionhandling;

public class OurThrowDefaultCatch {
	public static void main(String []args)
	{
		int balance=5000;
		int withdrawl=6000;
		
		if(balance<withdrawl)
		throw new ArithmeticException("Insufficient Balance");
		balance=balance-withdrawl;
		System.out.println("Transaction is completed");
			
		System.out.println("Program will continue");
	}

}
/*
Above program is an example of Our throw and Default catch by java
With the help of throw we can print our exception message with the help of exception class constructor

*/