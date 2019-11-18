//program to calculate the area of square rectangle cylinder using switch case statements
import java.util.Scanner;
class area
{
	void square()
	{
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the side of Square : ");
		x=scan.nextInt();
		System.out.println(" area = "+x*x);		
	}
	void rectangle()
	{
		int x,y;
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the length & breath of Rectangle : ");
		x=scan.nextInt();
		y=scan.nextInt();
		System.out.println(" area = "+x*y);
	}
	void cylinder()
	{
		int r,h;
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the radius & height of Cylinder : ");
		r=scan.nextInt();
		h=scan.nextInt();
		System.out.println(" area = "+2*r*3.14*(r+h));
	}
	public static void main(String arg[])
	{
		int ch;
		area obj=new area();
		Scanner scan=new Scanner(System.in);
		System.out.println(" \n1.Square \n2.Rectangle\n3.Cylinder\nEnter Your Choice : ");
		ch=scan.nextInt();
		switch(ch)
		{
			case 1: obj.square();
			break;
			case 2: obj.rectangle();
			break;
			case 3: obj.cylinder();
			break;
			default:System.out.println(" Wrong Choice ! ");
			break;
		}
	}
}