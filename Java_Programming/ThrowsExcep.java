class ThrowsExcep
{
    static void function_two() throws IllegalAccessException
    {
        System.out.println(" Caught Inside function_two(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[])
    {
        try
        {
            function_two();
        }
        catch(IllegalAccessException e)
        {
            System.out.println(" Caught Inside main(). ");
        }
    }
}
