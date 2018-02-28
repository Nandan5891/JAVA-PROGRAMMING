package INTERVIEW_PROGRAM;

public class FindNumber_From_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Page not found 404";
		System.out.println(str.replaceAll("[^0-9]", "")); // Fetch the number from string
		System.out.println(str.replaceAll("[0-9]", "")); // Fetch only string
		
		String s="ram234 nandan 455thkaur";
		System.out.println(s.replaceAll("\\D", ""));
		
	}

}
