package FILE_HANDLING;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchWordsInFile {
    public static void main(String[]args)throws IOException
    {
        FileReader reader = new FileReader("readlinebyline.txt");
        BufferedReader br= new BufferedReader(reader);

        String s;
        String[]words;
        int count=0;
        String input="java";

        while((s=br.readLine())!=null)
        {
            words=s.split(" ");
            for(String word:words)
            {
                if(word.equalsIgnoreCase(input))
                {
                    count++;
                }
            }
        }

        if(count!=0)
        {
            System.out.println("The given words is present for "   + count +   "  Times in the file");
        }
        else
        {
            System.out.println("The given words not present in the file");
        }

    }
}
