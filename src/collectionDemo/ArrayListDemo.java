
package collectionDemo;

import java.util.*;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj= new ArrayList();
		
		obj.add(1234);
		obj.add("N");
		obj.add("Rahul");
		obj.add("Rahul"); // duplicates value are allowed in arraylist
		obj.add(12.5);
		
		//System.out.println(obj);
		
		//System.out.println(obj.get(3));
		
		/*int arrsize=obj.size();
		
		for(int i=0;i<arrsize;++i)
		{
			System.out.println("Value from arraylist          :   "+obj.get(i));
		}
*/
		/*
		for(Object ele:obj)
		{
			System.out.println("Value from Arraylist is:       "+ele);
		}
		*/
		
		
		Iterator itr= obj.iterator();
		
		while(itr.hasNext())
		{
			Object value=itr.next();
			
			System.out.println("Values are:   " +value );	
		}
	}
}
