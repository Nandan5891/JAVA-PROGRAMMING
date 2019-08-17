package FILE_HANDLING;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) throws IOException {
        File file = new File("readlinebyline.txt");
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String s;

        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }

}
