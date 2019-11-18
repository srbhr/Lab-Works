//program to demonstrate exception handling using throws keyword
class throwsExcep
{
    static void laugh() throws IllegalAccessException
    {
        System.out.println(" Caught Inside laugh() ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String arg[])
    {
        try
        {
            laugh();
        }
        catch(IllegalAccessException e)
        {
            System.out.println(" Caught Inside main() ");
        }
    }
}