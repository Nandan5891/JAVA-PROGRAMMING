package INTERVIEW_PROGRAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_String {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		String[]arr= new String[]{"Ram","Mohan","Ganesh","Suresh","Shyam"};

		InputStreamReader reader= new InputStreamReader(System.in);
		System.out.println("Enter the String which you want to search");

		BufferedReader input= new BufferedReader(reader);
		String str=input.readLine();

		for(int i=0;i<str.length();++i)
		{
			if(str==arr[i])
			{
				System.out.println("String is in List");	
			}
		}
	}

}
