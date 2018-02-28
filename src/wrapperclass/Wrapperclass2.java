package wrapperclass;

public class Wrapperclass2 {
	public static void main(String[]args)
	{
		int i=100;
		Integer abc= Integer.valueOf(i); // Boxing (Converting primitive type into object abc)
		System.out.println("=====BOXING=====");
		System.out.println(abc);
	
		System.out.println("======UNBOXING======");
		int j= abc.intValue(); // Unboxing (convert object into primitive type j)
		System.out.println(j);
	}
}
