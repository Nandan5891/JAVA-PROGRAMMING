package PROPERTY_FILE_READ_WRITE;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class EnvProperty {
    private static EnvProperty envProperty = null;
    private EnvProperty() throws FileNotFoundException {
    }

    public static synchronized EnvProperty getInstance() throws FileNotFoundException {
        if (envProperty == null) {
            envProperty = new EnvProperty();
        }
        return envProperty;
    }

   static  Properties prop= new Properties();

    public static synchronized void setProperty(String key,String value) throws IOException {
        OutputStream os=new FileOutputStream("Config.properties");
        prop.setProperty(key,value);
        prop.store(os,null);
    }

    public String getPropery(String k)
    {
        return prop.getProperty(k);
    }

}