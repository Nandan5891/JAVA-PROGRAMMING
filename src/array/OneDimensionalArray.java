package array;
import java.util.*;
public class OneDimensionalArray {
	public static void main(String []args)
	{
		ArrayOneDimensional obj= new ArrayOneDimensional();
		obj.Array();
	}
}
class ArrayOneDimensional
{
	int []arr= new int[5];
	public void Array()
	{
	System.out.println("Enter any five number");
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<=4;++i)
	{arr[i]=sc.nextInt();}
	
	System.out.println("List of Array is following:");
	for(int i=0;i<=4;++i)
	{System.out.print("  "+arr[i]);}
	}
}
/*
 int arr[]= new int[]{2,3,5,6};-->Right
 int arr[]= new int[2]{2,4,5,9}; --->Error
 int arr[]= new int[5]{2,3,4,5,9}--->Error
WE can not mention size and values together.
int arr[]={2,3,5,6};-->Right
 
 */ 
