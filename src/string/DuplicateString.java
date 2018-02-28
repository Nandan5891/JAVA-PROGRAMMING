package string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[]={"Ram","Nandan","Rahul","Shyam","Raju","Ram"};

		
	/*	for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i].equals(name[j]))
				{
					System.out.println("Element is founded in list  :---    " +name[i]);
				}
				
			}
		}
	*/
		
	// Alternate Method
		
		Set<String>store= new HashSet<String>();
		
		for(String ele:name)
		{
			if(store.add(ele)==false)
			{
				System.out.println("Element is in the list    : "+ele);
			}
		}
	
	}
}


