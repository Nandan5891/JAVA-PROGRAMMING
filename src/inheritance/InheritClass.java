package inheritance;
/** Private members of athe superclasses are not accessible by the subclass and can only
 be indirectly accessed (availability)
 (2) Members that have default accessiblity in the superclass are aslo not accessible by 
 subclass in other package **/
public class InheritClass {
	public static void main(String []args)
	{
	Student s1= new Student();
	s1.SetAge(50);
	s1.SetName("Ganesh");
	s1.SetRollno(10);
	
	s1.GetAge();
	s1.GetName();
	s1.Getrollno();
	System.out.println("Name is:" +s1.GetAge());
	System.out.println("Age is:"+s1.Getrollno());			
	}
}

class Person
{
	private int age;
	private String name;
	public void SetAge(int A)
	{age=A;}
	public void SetName(String N)
	{name=N;}
	public int GetAge()
	{return(age);}
	public String GetName()
	{return(name);}
}
class Student extends Person
{
private int rollno;
public void SetRollno(int R)
{rollno=R;}
public int Getrollno()
{return (rollno);}
}