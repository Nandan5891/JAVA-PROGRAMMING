package INTERVIEW_PROGRAM;

public class Fibonacci_Series {

		public static void main(String []args)  
		{

			int first=0;
			int second=1;
			int third;
			int count=10;
			
			System.out.println(first+" "+second);
			for(int i=1;i<=count;++i)
			{
				third=first+second;
				System.out.print(" " +third);
				first=second;
				second=third;
			}
		}

	}

