package INTERVIEW_PROGRAM;

import java.util.Scanner;

public class MiddleString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any String");
		str=sc.nextLine();

		int position;
		int length;

		if(str.length()%2==1)
		{
			position=str.length()/2;
			length=1;
		}
		else
			position=str.length()/2-1;
		length=2;

		String result=str.substring(position, position+length);
		System.out.println(result);
	}

}
