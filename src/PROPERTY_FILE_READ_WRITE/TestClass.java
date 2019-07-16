package PROPERTY_FILE_READ_WRITE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestClass {
    public static void main(String[] args) throws IOException {

        EnvProperty envProperty = EnvProperty.getInstance();
        envProperty.setProperty("Name", "Ram");
        envProperty.setProperty("Address", "Rohini");
        envProperty.setProperty("Mobile", "9250604216");

        System.out.println("======Get Propery File Value========");

        String Name = envProperty.getPropery("Name");
        String Address=envProperty.getPropery("Address");
        String Mobile=envProperty.getPropery("Mobile");

        System.out.println("Name --->" + Name);
        System.out.println("Address --->" + Address);
        System.out.println("MObileNo --->" + Mobile);
    }
}
