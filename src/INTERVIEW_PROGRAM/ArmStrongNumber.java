package INTERVIEW_PROGRAM;

import java.util.Scanner;

public class ArmStrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num,arm = 0,rem,temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+(rem*rem*rem);	
		}

		if(temp==arm)
		{
			System.out.println("ArmStrong Number");
		}
		else
			System.out.println("You have entered wrong number");
		
	}

}
