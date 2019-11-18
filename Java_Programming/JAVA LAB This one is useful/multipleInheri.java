//program to demonstrate interfaces & use them to show multiple inheritance  
interface a
{
    default void show()
    {
        System.out.println(" interface a ");
    }
}
interface b
{
    default void show()
    {
        System.out.println(" interface b ");
    }
}
class multipleInheri implements a,b
{
    public void show()
    {
        a.super.show();
        b.super.show();
    }
    public static void main(String arg[])
    {
        multipleInheri c = new multipleInheri();
        c.show();
    }
}