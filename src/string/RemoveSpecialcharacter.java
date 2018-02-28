package string;

public class RemoveSpecialcharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to Remove special special character or any junk character we will use Regular Expression like [^a-zA-Z0-9]
		// It means except a-z,A-Z and 0-9 all unwanted character will be deleted from the string

		String s="&%$#@ RamNandan &%$#@";
		
		
		String newstring=s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println("Old String is  :    "+s);
		
		System.out.println("New String is  :    "+newstring);
		
		
		
	}

}
