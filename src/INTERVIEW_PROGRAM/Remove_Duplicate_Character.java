package INTERVIEW_PROGRAM;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Character {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String str="RamNandan";
		Set<Character>set= new HashSet();
		StringBuffer sf= new StringBuffer();
		
		for(int i=0;i<str.length();++i)
		{
			Character c=str.charAt(i);  // It will return R
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
		}	
		System.out.println("After removing duplicate element result of string is     : "+sf);
	}
}
