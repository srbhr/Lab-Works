//program to check leap year
import java.util.Scanner;
class leapYear
{
	public static void main(String arg[])
	{
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the Year : ");
		year=scan.nextInt();
		if(year%4==0)
		System.out.println(" Leap Year ! ");
		else
		System.out.println(" Not Leap Year ! ");
	}
}