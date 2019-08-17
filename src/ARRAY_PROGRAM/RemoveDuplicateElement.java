package ARRAY_PROGRAM;

import java.util.Arrays;

public class RemoveDuplicateElement {

    public static void removeDuplicateElement(int[]aa)
    {
        int length=aa.length;
        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(aa[i]==aa[j])
                {
                    aa[j]=aa[length-1];
                    length--;
                }
            }
        }

        System.out.println("After Removing duplicate element is");
        for(int i=0;i<aa.length;++i )
        {
            System.out.print(aa[i] + " ");
        }


    }

    public static void main(String[] args) {

        int []arr= {11,22,33,44,55,11};
        System.out.println("Before Removing element of array is: "+ Arrays.toString(arr));
        RemoveDuplicateElement.removeDuplicateElement(arr);

    }
}


