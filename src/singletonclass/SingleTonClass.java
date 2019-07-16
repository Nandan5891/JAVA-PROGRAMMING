package singletonclass;

public class SingleTonClass {
    public static void main(String[]args)
    {
        Employee employee=Employee.getInstance();
    }
}
class Employee
{
    private static Employee emp=null;
    private Employee()
    {
        System.out.println("I am Private Constructor");
    }

    public static Employee getInstance()
    {
        if(emp==null)
        {
            emp=new Employee();
        }
        return emp;
    }
}