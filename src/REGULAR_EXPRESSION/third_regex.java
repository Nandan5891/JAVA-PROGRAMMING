package REGULAR_EXPRESSION;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class third_regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p= Pattern.compile(".s"); //Represent single character 

		Matcher m=p.matcher("as");

		boolean b=m.matches();

		System.out.println(b);

		//Alternate method

		System.out.println(Pattern.matches(".s", "as")); // True Second character is s
		System.out.println(Pattern.matches(".s","mk")); // False as second character is not s
		System.out.println(Pattern.matches(".s", "mst")); // False (has more than 2 character
		System.out.println(Pattern.matches(".s", "amms")); //False(has more than 2 character
		System.out.println(Pattern.matches("..s","mas")); // True(3rd character is s

	}
}
