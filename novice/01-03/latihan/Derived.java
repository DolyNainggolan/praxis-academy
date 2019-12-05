class Base
{
    public void display ()
    {
        system.out.println ("Base display()");
    }
}
class Derived extends Base
{
    @override
    public void display (int x)
    {
        system.out.println ("Derived display (int )");
    }
    public static void main (String args[])
    {
        Derived obj = new Derived();
        obj.display();
    }
}