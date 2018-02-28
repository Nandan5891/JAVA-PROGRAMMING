package string;

public class ReverseString {

	/**
	 * @param args
	 * String is Immutable Class
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	String s="RamNandan";

		int length=s.length();
		System.out.println("Length of string is: ---->    "+length);

		String rev="";

		for(int i=length-1;i>=0;--i)
		{
			rev=rev+s.charAt(i);			
		}
	System.out.println("Actual String is  :  "+s);
	System.out.println("Reverse String is   :    "+rev);

		 */

		//Alternate Method

		StringBuffer s= new StringBuffer("RamNandan"); //StringBuffer is mutableClass

		StringBuffer rev=s.reverse();

		System.out.println("ReverseString is :   "+rev);


	}

}
