package SERIALIZATION;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_Demo {

	/**Serialization is mechanism through which we can store class of an object in persistent state in the form
	 * of Byte. For this we have to implement serializable interface.  
	 * @param args
	 */
	public static void main(String[] args) {

		shoe obj= new shoe(10);
		try
		{
			//Serialization
			FileOutputStream fo= new FileOutputStream("shoeDB.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fo);
			oos.writeObject(obj);
			oos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Deserialization
		try
		{
			FileInputStream fis= new FileInputStream("shoeDB.ser");
			ObjectInputStream ois= new ObjectInputStream(fis);
			obj=(shoe) ois.readObject();
		}
		catch(Exception e)
		{e.printStackTrace();}
	}

}

class shoe implements Serializable
{
	int size;
	shoe(int s)
	{
		size=s;
	}

}