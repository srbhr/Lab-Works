//program to show parameter passing within the method
class paraPass
{
    void add(int x,int y)
    {
        System.out.println(" result = "+(x+y));
    }
    void sub(int x,int y)
    {
        System.out.println(" result = "+(x-y));
    }
    public static void main(String arg[])
    {
        paraPass obj1=new paraPass();
        demo obj2=new demo();
        obj1.add(22,7);
        obj1.sub(22,7);
        obj2.mult(11,7);
    }   
}
class demo
{
    void mult(int x,int y)
    {
        System.out.println(" result = "+(x*y));
    }
}