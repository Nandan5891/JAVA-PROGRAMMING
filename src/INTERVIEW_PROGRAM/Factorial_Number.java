package INTERVIEW_PROGRAM;

import java.util.Scanner;

public class Factorial_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,factorial=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();

		for(int i=1;i<=num;++i)
		{
			factorial=factorial*i;
		}

		System.out.println("Factorial Value is: --> " +factorial);	
	}

}
