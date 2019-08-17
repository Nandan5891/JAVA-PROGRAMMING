package FILE_HANDLING;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindNumberOfWords {
    public static void main(String[]args)throws IOException
    {
        File file= new File("readlinebyline.txt");
        Scanner sc= new Scanner(file);

        int count=0;

        while(sc.hasNext())
        {
            sc.next();
            count++;
        }
        System.out.println("Total number of words in a file is: "+count);
    }
}
