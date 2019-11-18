//program to demonstrate the use of multiple classes
class multiClass
{
    void add()
    {
        int x=7,y=5;
        System.out.println(" result = "+(x+y));
    }
    void sub()
    {
        int x=7,y=5;
        System.out.println(" result = "+(x-y));
    }
    public static void main(String arg[])
    {
        multiClass obj1=new multiClass();
        demo obj2=new demo();
         obj1.add();
         obj1.sub();
         obj2.mult();
    }
}
class demo
{
    void mult()
    {
        int x=7,y=5;
        System.out.println(" result = "+(x*y));
    }
}