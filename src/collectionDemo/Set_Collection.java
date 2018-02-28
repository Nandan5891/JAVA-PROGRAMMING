package collectionDemo;

import java.util.HashSet;

public class Set_Collection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    HashSet<String>ele= new HashSet<String>();
	    
	    ele.add("RamNandan");
	    ele.add("Rahul");
	    ele.add("Ganesh");
		ele.add("Kailash");
		
		System.out.println(ele);
		System.out.println("Size is:  "+ ele.size());
		
		for(String value:ele)
		{
			System.out.println(value);
		}

	}

}
