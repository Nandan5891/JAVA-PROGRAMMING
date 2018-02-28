package thread;

public class ThreadUsingThreadClass {
	public static void main(String []args) throws Exception
	{
		First obj= new First();
		Second obj1= new Second();
		obj.start();
		obj1.start();
	}
	
}

class First extends Thread
{
	public void run()
	{
		int i=0;
		for(i=0;i<=10;i++)
		System.out.println("Thread First:"+i);
	}
}
class Second extends Thread
{
	public void run()
	{
		int i=0;
		for(i=0;i<=10;i++)
		System.out.println("Thread Second:"+i);
	}

}