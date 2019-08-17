package FILE_HANDLING;

import java.io.*;

public class CopyOneFileToAnotherFile {
    public static void main(String[] args) throws IOException {

        File file = new File("G:\\SELF CLONED PROJECT\\JAVA PROGRAMMING\\source.txt");
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        FileWriter fw = new FileWriter("Target.txt", true);

        String str;
        while ((str = br.readLine()) != null) {
            fw.write(str);
            fw.flush();
        }
        br.close();
        fw.close();
        System.out.println("File copied successfully");
    }

}
