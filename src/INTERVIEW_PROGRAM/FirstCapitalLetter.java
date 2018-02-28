package INTERVIEW_PROGRAM;

public class FirstCapitalLetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="india is a great country";

		StringBuilder sb= new StringBuilder(str.length());

		String[]arr=str.split("\\ ");

		for(int i=0;i<arr.length;++i)
		{
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
		}
		System.out.println(sb);

		//Alternate Method
		
		/*String str1="india is a great country";
		
		String[]arr1=str1.split("\\ ");
		System.out.println(arr.length);

		for(int i=0;i<arr1.length;++i)
		{
		System.out.print(arr1[i].toUpperCase().charAt(0) + arr1[i].substring(1)+ " ");
		}

*/	
	}
}
