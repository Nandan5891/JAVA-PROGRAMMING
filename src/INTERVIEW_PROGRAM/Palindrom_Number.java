package INTERVIEW_PROGRAM;

import java.util.Scanner;

public class Palindrom_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num,temp,rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		num=sc.nextInt();

		temp=num;

		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}

		if(temp==rev)
		{
			System.out.println("It is Palindrom Number");
		}
		else
		{
			System.out.println("Sorry! you have entered wrong number. please try again.........");
		}
	}

}
