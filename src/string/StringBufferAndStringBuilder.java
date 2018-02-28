package string;

public class StringBufferAndStringBuilder {
		
	public static void main(String []args) 
	{
		String s1="ram";
		String s2=s1+"nandan";
		
		System.out.println("s1=  :"+s1.hashCode()); // hashcode represent memory location.
		System.out.println("s2=  :"+s2.hashCode());
		System.out.println("=====================");
		
		StringBuffer sf= new StringBuffer("Hello");
		System.out.println("sf=  : "+sf.hashCode());
		sf.append("Ganesh");
		System.out.println("New value of sf is:  " +sf.hashCode());
		
		sf.append("Good Morning");
		System.out.println("After appending the value of sf is:  " +sf.hashCode());
		
		System.out.println("=====================");
		
		StringBuilder sb= new StringBuilder("Selenium");
		System.out.println("sb---> " +sb.hashCode());
		
		sb.append("With Java");
		
		System.out.println("AFter appending value of sb is:  "+sb.hashCode());
		
	}

}
// String is Immutable but String Buffer and Strinb Builder are mutable.
// String is slower than Strinb Builder.
// String use SCP(String Constant Pool )area but StringBuffer and StringBuilder use Heap Area.
// When we concatenate with string then a new object creates but in StringBuffer and StringBuilder doesn't create new object after appending'