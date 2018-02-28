import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Test
{
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String []args) throws IOException  
	{

		String str="historicalmonument";

		Map<Character,Integer>map= new HashMap<Character,Integer>();

		int length=str.length();
		for(int i=0;i<length;++i)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					map.put(ch, map.get(ch)+1);
				}
				
			}
			
		}

		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+ "   "+m.getValue());
			
		}
		/*Set<Character>set=map.keySet();
		for(Character c:set)
		{
			if(map.get(c)>1)
			{
				System.out.println(c + "  "+map.get(c));
			}
		}*/
	}
}




