package oops4.methodoverloading;

public class Main {
    void print() {
        System.out.println("Print 1");
    }

    /*int print() {
        return 0;
    }

     */

    void print(String s) {
        System.out.println("Print 2");
    }
}
