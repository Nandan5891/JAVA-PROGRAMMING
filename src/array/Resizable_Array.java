package array;

public class Resizable_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		NandanCollection col= new NandanCollection();
		col.add("a");
		col.add("B");
		col.add("Ram");
		col.add("Shyam");
		col.add("Moha");

		System.out.println("Capacity is :  "+col.capacity()); // function calling
		System.out.println("Size of Array is:  "+col.size() ); // function calling
		
		System.out.println("Value from Index is:   "+col.get(1)); // fetch the value through index
		
		col.replace(1,"Ganesh");
	}

}

class NandanCollection    // Custom Collection. It will act as Resizable Array
{
	Object[]objArray= new Object[4];
	private int elecount=0;
	public void add(Object obj)
	{
		if(elecount==objArray.length)
			increaseArray();

		objArray[elecount]=obj;
		System.out.println(objArray[elecount]);
		elecount++;
	}

	public void increaseArray()
	{
		int newcapacity= objArray.length*2;

		Object[]nextArray= new Object[newcapacity];

		for(int i=0;i<objArray.length;++i)
		{
			nextArray[i]=objArray[i];

		}
		objArray= nextArray;
	}

	public int capacity()
	{
		return objArray.length;
	}
	public int size()
	{
		return elecount;

	}
	
	public Object get(int index)
	{
		return objArray[index];	
	}
	
	public void replace(int index, Object obj)
	{
		if(index<0||index>=size())
		{
			throw new IndexOutOfBoundsException("   "+index);
		}
		objArray[index]=obj;
		
	}
}


