package basic;

public class LifeTime {
	public static void main(String args[])
	{
		int i;
		for(i=1;i<=5;i++)
		{
		increment();
		}
	
	}
private static void increment()
	{
	int i=10;
	i++;
	System.out.println("The value of i is:" +i);
	}

}


