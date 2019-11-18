//program to demonstrate multithreading using interface
class MultiDemo2 implements Runnable
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
class multithreadInter
{
    public static void main(String[] arg)
    {
        int n = 7;
        for (int i=0; i<n; i++)
        {
            Thread object = new Thread(new MultiDemo2());
            object.start();
        }
    }
}