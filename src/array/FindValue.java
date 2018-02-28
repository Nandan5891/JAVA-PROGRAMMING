package array;
import java.util.*;

public class FindValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {11,22,33,44,55};

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number which you want to search");
		int search;
		search=sc.nextInt();

		for(int i=0;i<4;++i)
		{
			if(search==arr[i])
			{
				System.out.println("Number is available in the array");
			}
			 
		}

	}

}
