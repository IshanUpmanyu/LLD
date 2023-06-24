package concurrency.concorrency2.printHundred;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    // Print numbers 1 to 100, each on a separate thread.

    public static void main(String[] args) {
       // ExecutorService executorService = Executors.newFixedThreadPool(10);
       // ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newCachedThreadPool();
// New thread if not available

        // Reuse thread if available
        for( int i = 1; i <= 100; i ++) {
            NumberPrinter task = new NumberPrinter(i);
            executorService.execute(task);
            //start will internally call task.run();

            if( i == 5 || i == 11 || i ==20) {
                System.out.println("Debug");
            }
        }

        executorService.shutdown();
    }
}
