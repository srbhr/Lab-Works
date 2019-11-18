//program to demonstrate hierarchical inheritance
class one
{
	public void print1()
	{
		System.out.println(" Novak ");
	}
}
class two extends one
{
	public void print2()
	{
		System.out.println(" Djokovic ");
	}
}
class three extends one
{
	
}
class hierarInheri
{
	public static void main(String arg[])
	{
		three obj1=new three();
		obj1.print1();
 		two obj2=new two();
		obj2.print2();
		obj2.print1();
	}
}