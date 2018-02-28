package array;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String []args)
	{
		TwoDArray obj= new TwoDArray();
		obj.input();
		obj.Output();
	}
}
class TwoDArray
{
	int i,j;
	int [][]arr=new int[4][5];
	public void input()
	{
		System.out.println("Enter any number:");
		Scanner sc= new Scanner(System.in);
		for (i=0;i<=3;++i)
		{
			for(j=0;j<=4;++j)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	}
	public void Output()
	{
		System.out.println("List of Two Dimension Array is following:");
		for (i=0;i<=3;++i)
		{
			for(j=0;j<=4;++j)
			{
				System.out.print("  "+arr[i][j]);
			}
		System.out.println();
		}
	}
}
/*
 CREATING TWO D ARRAY
 int [][]arr= new int[4][5];
 
 int [][]arr= new int[][]-->Error (Size is not available here)
 int [][]arr=new int[][4]-->Error
 int[][]arr=new int[4][]--->Correcct
 
*/