//program to calculate the sum of numbers entered by the user until 0 using do while loop
import java.util.Scanner;
class dowhile
{
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        int num=1,sum=0;
        do
        {
            System.out.println(" enter the number : ");
            num=scan.nextInt();
            sum=sum+num;
        }while(num!=0);
        System.out.println(" sum = "+sum);
    }
}