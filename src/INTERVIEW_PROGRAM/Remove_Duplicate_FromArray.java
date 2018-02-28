package INTERVIEW_PROGRAM;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicate_FromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[]array=new int[]{11,22,33,11,55,66,99,55};
		sortArray(array);

	}
	public static void sortArray(int[]arr)
	{
		List<Integer>list= new ArrayList<Integer>();
		for(int i:arr)
		{
			list.add(i);
		}
		Set<Integer>set= new HashSet<Integer>(list);
		for (Integer integer : set)
		{
			System.out.print(integer + " ");
		}
	}
}
