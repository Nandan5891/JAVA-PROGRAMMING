package constructor;
import java.util.*;
public class CosntructorAccess {
	public static void main(String []args)
	{
		int num1, num2, num3;
		System.out.println("Enter the length, breadth and Height");
		Scanner sc= new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		new construct();
		new construct(num1,num2,num3);
	}
}

class construct
{
	 private int l,b,h;
	  public construct()
	{
		System.out.println("Constructor without parameter");
		  l=10;
		  b=8;
		  h=4;
		  System.out.println("Length is:" +l);
		  System.out.println("Breadth is:" +b);
		  System.out.println("height is:"+ h);
	}
	 public construct(int L, int B, int H)
	 {
	System.out.println("Parametized constructor");
	int length=L;
	 int breadth=B;
	 int height=H;
	 System.out.println("Length :"+length);
	 System.out.println("Breadth:"+breadth );
	 System.out.println("Height:"+height);
		 
	 }
}