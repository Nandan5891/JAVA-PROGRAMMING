package FILE_HANDLING;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindVowelWordsInFile {
    public static void main(String[]args)throws IOException
    {
        File file= new File("Name.txt");
        FileReader reader= new FileReader(file);
        BufferedReader br= new BufferedReader(reader);
        String str;
        String[]words;

        while((str=br.readLine())!=null)
        {
            char[]ch=str.toCharArray();

            for(int i=0;i<ch.length;++i)
            {

            }
        }
    }
}