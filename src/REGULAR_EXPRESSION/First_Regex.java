package REGULAR_EXPRESSION;

public class First_Regex {

	/**The Java Regex or Regular Expression is an API to define pattern for searching or manipulating strings.
	 * It provides following classes and interface for regular expressions. The Matcher and Pattern classes are widely used in java regular expression.

MatchRes ult interface
Matcher class
Pattern class
PatternSyntaxException class

	 * @param args
	 */
	public static void main(String[] args) {

		/*String data="Apple Microsoft IBM Intel";

		String[]companies=data.split(" "); // we can also use data.split("\\s") for single white space

		for(String comp:companies)
		{
			System.out.println(comp);
		}*/

		/*System.out.println("======Follwing code for delete multiple whilte space=========");
		String data1="Apple        Microsoft              IBM   Intel";
		String[]companies1=data1.split("\\s+");
		for(String comp1:companies1)
		{
			System.out.println(comp1);
		}
		 */

		/*String data="Apple.Microsoft.IBM.Intel";

		String[]companies=data.split("\\."); // we can also use data.split("\\s") for single white space

		for(String comp:companies)
		{
			System.out.println(comp);

		}*/

		// It will extract number from string

		String data="Apple123Microsoft456IBM789Intel";
		System.out.println(data.replaceAll("\\D", "")); // Extract no from string
		// System.out.println(data.replaceAll("[^0-9]+","");	
		//System.out.println(data.replaceAll("[^a-zA-Z]+","");
		
	}

}


