package switchcase;
import java.util.*;
public class SwitchDemo {
	public static void main(String[]args)
	{
		Demo.display();	
	}
}

class Demo
{
	public static void display()
	{
		int num;
		System.out.println("Enter any number");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		switch(num)
  
		{
		case 1:
			System.out.println("I am Sunday");
			break;
		case 2:
			System.out.println("I am Monday");
			break;
		case 3:
			System.out.println("I am Tuesday");
			break;
		case 4: 
			System.out.println("I am Wednesday");
			break;
		case 5:
			System.out.println("I am Thursday");
			break;
		case 6:
			System.out.println("I am Friday");
			break;
		case 7:
			System.out.println("I am Saturday");
			default:
			System.out.println("Dont know how many days are there in a week? ");
		}
	}
}