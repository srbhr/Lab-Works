//program to demonstrate multilevel inheritance
class one
{
	public void print1()
	{
		System.out.println(" Rafael ");
	}
}
class two extends one
{
	public void print2()
	{
		System.out.println(" Nadal ");
	}
}
class three extends two
{
	public void print3()
	{
		System.out.println(" Rafael ");
	}
}
class multiInheri
{
	public static void main(String arg[])
	{
		three obj=new three();
		obj.print1();
		obj.print2();
		obj.print3();
	}
}