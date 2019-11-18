//program to print fibonacci series
class fibonacci
{
	public static void main(String arg[])
	{
		int a=0,b=1,c,i=0;
		System.out.println(" fibonacci series is : ");
		System.out.println("\t"+a+"\n\t"+b);
		while(i<11)
		{
			c=a+b;
			System.out.println("\t"+c);
			a=b;
			b=c;
			i++;
		}
	}
}