package string;

public class StringMethod {
	public static void main(String[]args)
	{
		StrMethod obj= new StrMethod();
		obj.CaseConversion();
		obj.Indexof();
	}
}
class StrMethod
{
	public void CaseConversion()
	{
	String str="my name is ramnandan thakur";
	System.out.println(""+str.toUpperCase()); // Change in UpperCase
	String str1="INDIA IS A GREAT COUNTRY";   
	System.out.println(""+str1.toLowerCase());// Change in LowerCase
	}
	public void Indexof()
	{
	int i=0;
	int j=0;
	String str="Historicalmonument";
	i=str.indexOf('m');
	System.out.println("Index of b in Historicalmonumnet is: " +i); // count from zero index 
	j=str.indexOf('a',3); // Count from Index 3
	System.out.println("Index from 3 is:"+j);
	String str2="Computer";
	j=str2.indexOf("ute");
	System.out.println("Index of Ute is : " +j);
	}
}