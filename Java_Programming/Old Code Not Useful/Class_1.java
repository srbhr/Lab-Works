package Java_LAB;

class Class_1 {

    // Calling the constructor of the class to demonstrate which class are we in
//    Class_1(){
//        System.out.println("This is Class 1");
//    }

    void Add(){
        int a = 10, b =15, c = a+b;
        System.out.println(a + " + " + b);
        System.out.println("Addition : " + c);
    }
    public static void main(String[] args){
        Class_1 a = new Class_1();
        Class_2 b = new Class_2();
        a.Add();
        b.Subtract();

    }

}
class Class_2 {
    // Calling the constructor of the class to demonstrate which class are we in
//    Class_2() {
//        System.out.println("This is Class 2");
//    }

    void Subtract() {
        int a = 15, b =10, c = a - b;
        System.out.println(a + " - " + b);
        System.out.println("Subtraction : " + c);
    }
}
