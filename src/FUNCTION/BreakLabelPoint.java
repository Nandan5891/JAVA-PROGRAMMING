package FUNCTION;

public class BreakLabelPoint {

	public static void main(String []args)
	{
	int i,j;
	Outer:for(i=1;i<=10;i++)
	   {
	 inner:for(j=1;j<=10;j++)
	      {
	      System.out.print("" +j);
	      if(i==j)
                {
		System.out.println();
		break inner;
	        }
	       else if(j==10)
	       {
	      break Outer;
	       }
      }
    }	
  }
}

