//program to demostrate method overloading
class adder
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    double add(double a,double b)
    {
        return a+b;
    }
}
class methodOverload
{
    public static void main(String arg[])
    {
        adder obj=new adder();
        System.out.println(" sum = "+obj.add(5,7));
        System.out.println(" sum = "+obj.add(5,7,11));
        System.out.println(" sum = "+obj.add(5.3,7.2));
    }
}