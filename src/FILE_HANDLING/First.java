package FILE_HANDLING;

import java.io.File;
import java.io.IOException;

public class First {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		File fl= new File("Name.txt");
		fl.createNewFile();
		System.out.println(fl.exists());
		System.out.println(fl.getName());
		System.out.println(fl.length());
		//fl.delete(); it will delete the file
	}

}
