package FILE_HANDLING;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileLineByLine {
    public static void main(String[]args) throws IOException
    {
        File file= new File("writefilelinebyline.txt");

        FileWriter fw= new FileWriter(file);

        fw.write("My name is Ram Nandan. \n");
        fw.write("I live in Delhi. \n");
        fw.write("I belong to bihar, \n");

        fw.flush();
        fw.close();

    }


}
