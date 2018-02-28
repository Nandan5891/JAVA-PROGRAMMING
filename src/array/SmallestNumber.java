package array;

public class SmallestNumber {

	/**
	 * @param args
	 * Find the smalles number from array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		number obj= new number();
		obj.smallest();
		obj.largest();
		obj.sum();
	}

}

class number
{
	public void smallest()
	{
		int []arr={6,5,4,3,2,1};
		int min=arr[0];
		
		for(int i=1;i<=5;++i)
		{
			min=arr[0];
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Smalles number is:   "+min);
	}


	public void largest()
	{

		int []arr={1,2,3,4,5,6};
		int largest=arr[0];

		for(int i=1;i<=5;++i)
		{
			largest=arr[0];
			if(largest<arr[i])
			{
				largest=arr[i];
			}
		}
		System.out.println("Smalles number is:   "+largest);
	}
	
	public void sum()
	{
		
		int []arr={1,2,3,4,5,6};
		int sum=0;
		
		for(int i=0;i<=5;++i)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array is:   "+sum);
	}
		
	}





