package ARRAY_PROGRAM;

public class FindMIssingNumber {
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4,6};
        int missingNumber=Data.missingNumber(arr,6);

        System.out.println("MIssing number is: "+missingNumber);
    }
}

class Data
{
    public static int missingNumber(int []a,int n)
    {
        int expectedSum=(n*(n+1)/2);
        int actualSum=0;
        for(Integer ii:a)
        {
            actualSum=actualSum+ii;
        }
        return expectedSum-actualSum;
    }
}
