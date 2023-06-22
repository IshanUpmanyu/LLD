package concurrency.concorrency1;

public class HelloWorldPrinter implements Runnable {
    public void run() {
        System.out.println("Hello world from task, from thread: " + Thread.currentThread().getName());
    }
}
