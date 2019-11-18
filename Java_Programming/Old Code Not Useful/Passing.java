package Java_LAB;

class Passing {

    void Add(int a, int b){
        int c = a+b;
        System.out.println(a + " + " + b);
        System.out.println("Addition : " + c);
    }

    void Subtract(int a, int b) {
        int c = a - b;
        System.out.println(a + " - " + b);
        System.out.println("Subtraction : " + c);
    }
    public static void main(String[] args){
        Passing obj1 = new Passing();
        Profound obj2 = new Profound();
        obj1.Add(12, 456);
        obj1.Subtract(435, 56);
        obj2.Multiplying(1233, 678);
    }

}

class Profound{

    void Multiplying(int a, int b) {
        int c = a * b;
        System.out.println(a + " * " + b);
        System.out.println("Multiplication : " + c);
    }

}
