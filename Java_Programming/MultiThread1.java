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
public class MultiThread1
{
    public static void main(String[] args)
    {
        int n = 8;
        for (int i=0; i<8; i++)
        {
            MultiDemo1 object = new MultiDemo1();
            object.start();
        }
    }
}