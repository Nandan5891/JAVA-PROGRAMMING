package REGULAR_EXPRESSION;

public class Second_regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String data="1234567";
		
		String reg="[0-9]+";
		
		String reg1="[a-zA-Z]+";
		
		System.out.println(data.matches(reg)); // To check only number is present in string or not and return true or false
		
		System.out.println(data.matches(reg1)); // return false as reg1 patter is not in data string
		
	}

}
