package string;

public class Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="Ram_Nandan_is_going_to_school";
		test.split("_");
		String []name=test.split("_");
		
		for(int i=0;i<name.length;++i)
		{
			System.out.println(name[i]);	
		}
		
	}

}
