//Aim 5: Show multiple classeswith using a constructor


package Java_LAB;

import java.util.Scanner;

public class Student_Multi {
    public static void main(String [] args){
        String name, subject;
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the Student's Name");
        name = sc.nextLine();
        System.out.println("Provide the Student's Subject ");
        subject = sc.nextLine();
        System.out.println("Provide the Student's Marks ");
        marks = sc.nextInt();
        Student_Name s_n = new Student_Name(name);
        Student_Subj s_s = new Student_Subj(subject);
        Student_Marks s_m = new Student_Marks(marks);

        System.out.println(s_n.Name + " Has Scored in Subject " + s_s.Subject + " These Marks " + s_m.Marks);
    }
}

class Student_Name {
    String Name;
    Student_Name(String a) {
        Name = a;
    }
}
class Student_Subj{
    String Subject;
    Student_Subj(String b){
        Subject = b;
    }}
class Student_Marks{
    int Marks;
    Student_Marks(int c){
    Marks = c;
    }
}

