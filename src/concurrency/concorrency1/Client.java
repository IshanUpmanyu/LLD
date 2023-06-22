package concurrency.concorrency1;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello from thread: " + Thread.currentThread().getName());
        HelloWorldPrinter task = new HelloWorldPrinter();
        Thread t = new Thread(task);
        t.start();
    }
}
