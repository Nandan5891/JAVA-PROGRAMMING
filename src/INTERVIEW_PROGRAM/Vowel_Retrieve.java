package INTERVIEW_PROGRAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vowel_Retrieve {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		/*String str="Historicalmonumnet";

		int length=str.length();
		int count=0;
		for(int i=0;i<length;++i)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				System.out.println("Vowels are   : "+str.charAt(i));
				count++;
			}
		}

		System.out.println("Total Number of vowels are  : "+count);

		 */	
		InputStreamReader reader= new InputStreamReader(System.in);
		BufferedReader input= new BufferedReader(reader);

		System.out.println("Input any String");

		String str=input.readLine();
		int count=0;

		for(int i=0;i<str.length();++i)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				System.out.println("Vowels are   : "+str.charAt(i));
				count++;
			}
		}

		System.out.println("number of vowels are   : "+count);
	}

}
