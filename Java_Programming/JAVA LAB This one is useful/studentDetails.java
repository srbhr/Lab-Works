//program to show multiple classes using constructor & display student details
import java.util.Scanner;
class student 
{
	String sName;
    String sSubject;
	int sMarks;
	public student(String name,String subject,int marks) 
	{
        this.sName=name;
    	this.sSubject=subject;
    	this.sMarks=marks;
    }
	public void printDetails() 
	{
        System.out.println(" Name : "+this.sName);
    	System.out.println(" Subject : "+this.sSubject);
		System.out.println(" Marks : "+this.sMarks);    	
	}
}
class studentDetails
{
	public static void main(String arg[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter Name of Student : ");
    	String name_1=scan.nextLine();
    	System.out.println(" Enter Subject of Student : ");
    	String sub_1=scan.nextLine();
    	System.out.println(" Enter Marks of Student : ");
    	int marks_1=scan.nextInt();
		student obj=new student(name_1,sub_1,marks_1);
		System.out.println("\n Details of Student are : \n ");
    	obj.printDetails();
	}
}