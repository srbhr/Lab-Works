//program to demonstrate multithreading using inheritance
class MultiDemo1 extends Thread
{
    public void run()
    {
        try
        {
            System.out.println (" Thread " + Thread.currentThread().getId() + " is Running ");
        }
        catch (Exception e)
        {
            System.out.println (" Exception is Caught ");
        }
    }
}
public class multithreadInheri
{
    public static void main(String[] arg)
    {
        int n = 7;
        for (int i=0; i<n; i++)
        {
            MultiDemo1 object = new MultiDemo1();
            object.start();
        }
    }
}