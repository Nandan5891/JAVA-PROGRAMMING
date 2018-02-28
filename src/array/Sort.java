package array;

import java.util.Arrays;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int []arr={2,8,1,10,45,43,23,9};
		
		String[]name={"Ram","Shyam","Ganesh","Mohan","Sohan"};
		
		System.out.println("Original Numeric Array");
		
		System.out.println(Arrays.toString(arr));
		System.out.println("========================");
		
		System.out.println("After Sorting");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("========================");
		
		System.out.println("Original String Array");
		System.out.println(Arrays.toString(name));
	}
}
