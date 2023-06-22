package concurrency.concorrency1;

public class HelloWorld {

    public static void doSomething() {
        System.out.println("Printing do something, from thread: " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Hello World! from thread: " + Thread.currentThread().getName());
        doSomething();
    }
}
