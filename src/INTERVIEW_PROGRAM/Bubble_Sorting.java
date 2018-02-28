package INTERVIEW_PROGRAM;

import java.util.Arrays;

public class Bubble_Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr=new int[]{34,15,20,8};

		int length=arr.length;

		for(int i=0;i<=length;++i)
		{
			for(int j=1;j<(length-1);++j)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}


			}

		}

		
	}

}
