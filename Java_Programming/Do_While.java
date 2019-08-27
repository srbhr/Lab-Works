package Java_LAB;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {

        int number, sum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Sum = " + sum);
    }
}
