package Java_LAB;

import java.util.Scanner;

public class Areas {
    void square(){
        int length, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square ::");
        length = sc.nextInt();
        area = length* length;
        System.out.println("Area of the square is ::"+area);
    }

    void rectangle(){
        int length, breadth, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length & Breadth of the rectangle ::");
        length = sc.nextInt();
        breadth = sc.nextInt();
        area = length* breadth;
        System.out.println("Area of the square is ::"+area);
    }

    void cylinder(){
        int r, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=sc.nextInt();
        System.out.println("Enter the height:");
        h=sc.nextInt();
        double  tsa=((2*22*r)/7)*(r+h);
        System.out.println("TotalSurfaceArea Of Cylinder is:  " + tsa);
    }
    public static void main(String[] args){
        int choice;
        Areas obj1 = new Areas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide your choice: \n 1.Square \n 2.Rectangle \n 3.Cylinder");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                obj1.square();
                break;
            case 2:
                obj1.rectangle();
                break;
            case 3:
                obj1.cylinder();
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
