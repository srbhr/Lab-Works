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
            System.out.println ("Exception is caught");
        }
    }
}
class MultiThread2
{
    public static void main(String[] args)
    {
        int n = 8;
        for (int i=0; i<8; i++)
        {
            Thread object = new Thread(new MultiDemo2());
            object.start();
        }
    }
}