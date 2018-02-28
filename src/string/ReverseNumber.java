package string;

public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int num=12345;
		
		int rev=0;
	
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
	System.out.println("Reverse Number is   :  "+rev);*/
	
	// Alternate Solution using StringBuffer Class
		int num1=98765;
		StringBuffer s1= new StringBuffer(String.valueOf(num1));
		System.out.println("Reverse number is    :   "+s1.reverse());	
	}
}
