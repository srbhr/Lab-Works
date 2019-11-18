//program to demonstrate single inheritance
class one
{
	public void print1()
	{
		System.out.println(" Roger ");
	}
}
class two extends one
{
	public void print2()
	{
		System.out.println(" Federer ");
	}
}
class singleInheri
{
	public static void main(String arg[])
	{
		two obj=new two();
		obj.print1();
		obj.print2();
		obj.print1();
	}
}