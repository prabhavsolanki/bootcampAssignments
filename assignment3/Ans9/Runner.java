package assignment3.Ans9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 9. Write a program to demonstrate the use of CountDownLatch


class Runner implements Runnable {
    private CountDownLatch latch;

    public Runner(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//      countdown() decrements the count that await() relies on.
        latch.countDown();
    }
}