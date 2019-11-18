//program to demonstrate exception handling using throw keyword
class throwExcep
{
    static void happy()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println(" Caught Inside happy() ");
            throw e;
        }
    }
    public static void main(String arg[])
    {
        try
        {
            happy();
        }
        catch(NullPointerException e)
        {
            System.out.println(" Caught Inside main() ");
        }
    }
}