package concurrency.concorrency1.printHundred;

public class Client {

    // Print numbers 1 to 100, each on a separate thread.

    public static void main(String[] args) {
        for( int i = 1; i <= 100; i ++) {
            NumberPrinter task = new NumberPrinter(i);
            task.run();
            Thread t = new Thread(task);
            t.start();
            //start will internally call task.run();
        }
    }
}
