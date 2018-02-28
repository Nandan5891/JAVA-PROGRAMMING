package FILE_HANDLING;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	/** Fileoutput stream is used to write the data into the file
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout= new FileOutputStream("new.txt",true);
		int i;
		String str="RamNandan";
		
		char[]ch=str.toCharArray();
		for( i=0;i<str.length();++i)
		{
			fout.write(ch[i]);
			//fout.close();
		}
	}
}
