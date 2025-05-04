package cmj.thread;

import java.util.ArrayList;
import java.util.List;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        // Example 1
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Worker thread done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t1.join(); // Main thread waits here

        System.out.println("Main thread resumes after t1");


        // Example 2
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> { /* work */ });
            threads.add(t);
            t.start();
        }
        for (Thread t : threads) {
            t.join(); // wait for all to finish
        }
        System.out.println("All threads completed");
    }
}
