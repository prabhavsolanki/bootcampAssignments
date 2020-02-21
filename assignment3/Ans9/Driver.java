package assignment3.Ans9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 9. Write a program to demonstrate the use of CountDownLatch

public class Driver {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);

//      Starting three threads
        for(int i=0; i < 3; i++) {
            executor.submit(new Runner(latch));
        }

        try {
            Thread.sleep(300);
            System.out.println("Main thread waiting for threads to complete...");

//          Main thread waiting for the three threads to complete
            latch.await();
            System.out.println("All three threads have completed their work");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed.");
        executor.shutdown();

    }



}
