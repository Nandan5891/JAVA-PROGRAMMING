package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, String>map= new HashMap<Integer, String>();
		
		String s1="RamNandan";
		
		map.put(108,"Gautam");
		map.put(102,"Senthil");
		map.put(103,s1);
		map.put(104,"Ravi");
		map.put(104,"Ram");
		
		
		
	/*	for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+ "   " + m.getValue());
			
		}*/
		
		Set set=map.entrySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			
			System.out.println(m.getKey() + " --> " + m.getValue());
			
		}
		
		
	/*	for(Integer key: map.keySet())
		{
			System.out.println("Keys are:    "+key);
		}

		for(String value: map.values())
		{
			
			System.out.println("Values are:   "+value);
		}
*/
	}

}
