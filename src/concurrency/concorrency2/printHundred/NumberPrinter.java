package concurrency.concorrency2.printHundred;

public class NumberPrinter implements  Runnable {
    private int number;

    public NumberPrinter(int n) {
        number = n;
    }
    public void run() {
        System.out.println(number + ": From thread: " + Thread.currentThread().getName());
    }
}
