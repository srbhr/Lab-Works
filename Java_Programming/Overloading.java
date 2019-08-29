// Write a process to demonstrate the method of overloading.


package Java_LAB;

public class Overloading {

    int Sum(int x, int y){
        return (x + y);
    }

    int Sum(int x, int y, int j, int l){
        return (x + y + j + l);

    }
    double Sum(double x, double y, double z){
        return (x + y + z);
    }
    String Sum(String a, String b){
        return (a + b);
    }
    public static void main(String [] args){
        Overloading sss  = new Overloading();
        System.out.println(sss.Sum(12,23));
        System.out.println(sss.Sum(12,23, 34, 56));
        System.out.println(sss.Sum(12.6, 23.9, 23.7));
        System.out.println(sss.Sum("Hello","World!"));
    }
}
