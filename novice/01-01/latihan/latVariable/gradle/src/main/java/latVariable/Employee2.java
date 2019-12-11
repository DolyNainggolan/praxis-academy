package latVariable;

public class Employee2
{
    //salary variable is a private static variable
    private static double salary;

    //Department is a constant
    public static final String Department = "Development";

    public static void main (String args[])
    {
        salary = 1000;
        System.out.println (Department + "average salary:" + salary);
    }
}