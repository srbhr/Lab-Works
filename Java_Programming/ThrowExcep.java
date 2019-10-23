class ThrowExcep
{
    static void function_one()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println(" Caught Inside function_one(). ");
            throw e;
        }
    }
    public static void main(String args[])
    {
        try
        {
            function_one();
        }
        catch(NullPointerException e)
        {
            System.out.println(" Caught Inside main(). ");
        }
    }
}
