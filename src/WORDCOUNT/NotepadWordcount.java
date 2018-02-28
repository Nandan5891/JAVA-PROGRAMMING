package WORDCOUNT;

import java.io.File;
import java.util.Scanner;

public class NotepadWordcount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file= new File("C:\\Users\\Ram Nandan Thakur\\Desktop\\format.txt");
		try
		{
			Scanner sc= new Scanner(file);
			int count=0;
			while(sc.hasNext())
			{
				sc.next();
				count++;
			}
			System.out.println("No of words are  : "+count);			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
