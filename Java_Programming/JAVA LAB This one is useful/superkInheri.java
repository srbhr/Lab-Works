//program to demonstrate inheritance using super keyword
class teacher
{
	void message()
	{
		System.out.println(" this is teacher class ");
	}
}
class student extends teacher
{
	void message()
	{
		System.out.println(" this is student class ");
	}
	void display()
	{
		message();
		super.message();
	}
}
class superkInheri
{
	public static void main(String arg[])
	{
		student s=new student();
		s.display();
	}
}