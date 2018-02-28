package INTERVIEW_PROGRAM;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []str= new String[]{"Ram","Shyam","Mohan","Ganesh","Ram"};
		int length=str.length;
		
		for(int i=0;i<length;++i)
		{
			for(int j=i+1;j<length;++j)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplicate String is:   "+str[i]);
				}
			}
		}
		
		/*
		Set<String>store= new HashSet<String>();
		
		for(String ele:str)
		{
			if(store.add(ele)==false)
			{
				System.out.println("Duplicate String is:   "+ele);
			}	
		}*/
	
		//Alternate Method
	
			}

}
