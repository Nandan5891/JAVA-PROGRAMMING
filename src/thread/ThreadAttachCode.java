package thread;
//create thread through Runnable interface
public class ThreadAttachCode {
	public static void main(String []args)
	{
		Thread t1= new Thread(new A());
		Thread t2= new Thread(new B());
		t1.start();
		t2.start();
	}
}
class A implements Runnable   // class A implements Runnable interface which contain abstract method run()
{
	public void run()
	{
		int i=0;
		for(i=0;i<=10;i++)
		System.out.println("Thread A:"+i);	
	}
	
}
class B implements Runnable
{
	public void run()
	{
		int i=0; 
		for(i=0;i<=10;i++)
		System.out.println("Thread B:"+i);	
	}
	
}