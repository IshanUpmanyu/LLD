package oops4.methodoverriding;

public class Client {
    public static void main(String[] args) {
        A a = new A();
       // a.print();

        B b = new B();
        //b.print();

        //Overriding works for methods
        A a1 = new B();
        a1.print();

        // Overriding is for methods only. Not for attributes
        System.out.println(a1.a);
    }
}
