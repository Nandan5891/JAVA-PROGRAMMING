package INTERVIEW_PROGRAM;

import java.util.HashMap;
import java.util.Set;

public class Duplicate_Character_inString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String input="javaessential";

		HashMap<Character, Integer>map= new HashMap<Character, Integer>();

		char[]strarray=input.toCharArray(); // converting input string to charArray

		for(char c:strarray)
		{
			if(map.containsKey(c)) // if character present in map then incrementing its integer count by 1
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1); 
			}
		}

		Set<Character>chrstring=map.keySet(); // Getting a set containing all keys in map 

		for(Character ch:chrstring)
		{
			if(map.get(ch)>1) // if any count is more than one then print its character
			{
				System.out.println(ch + "  " +map.get(ch));
			}
		}

	}

}
