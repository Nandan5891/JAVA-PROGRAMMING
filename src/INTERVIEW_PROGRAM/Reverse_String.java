package INTERVIEW_PROGRAM;

public class Reverse_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//First Method
		
		String str="RamNandan";
		int length=str.length();
		String rev="";
		
		for(int i=length-1;i>=0;--i)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse String is  :  "+rev);
	
		//Second Method
		
	/*
		StringBuffer str1= new StringBuffer("RamNandan");
		System.out.println(str1.reverse());
	
	*/
	
	}

}
