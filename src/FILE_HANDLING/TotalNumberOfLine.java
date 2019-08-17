package FILE_HANDLING;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class TotalNumberOfLine {
    public static void main(String[]args)throws IOException
    {
        File file= new File("readlinebyline.txt");
        FileReader reader = new FileReader(file);
        LineNumberReader lr= new LineNumberReader(reader);

        int lineNumber=0;

        while(lr.readLine()!=null)
        {
            lineNumber++;
        }
        System.out.println("Total number of line is : "+lineNumber);
    }
}
