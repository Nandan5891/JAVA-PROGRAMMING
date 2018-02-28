package INTERVIEW_PROGRAM;

import java.util.Scanner;

public class Number_of_Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any String");
		str=sc.nextLine();
		
		int count=0;
		
		char[]ch=str.toCharArray();
		for(char c:ch)
		{
			switch(c)
			{
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				count++;
				break;
			}
		}
		System.out.println("Number  of Vowels in String are: "+count);
	}

}
