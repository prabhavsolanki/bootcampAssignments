package assignment3;

// 4. Write a program to create a Thread pool of 2 threads where
//    one Thread will print even numbers and other will print odd numbers.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNumbers {

//    Method printing even numbers
    void evenNumber(){
        for (int i = 2; i <= 20; i+=2) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i + " is even");
        }
    }

//    Method printing ofd numbers
    void oddNumber() {
        for (int i = 1; i <= 20; i+=2) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i + " is odd");
        }
    }
}

public class Ans4 {
    public static void main(String[] args) {

//        Creating a thread pool of 2 threads
        ExecutorService pool = Executors.newFixedThreadPool(2);
        PrintNumbers printer = new PrintNumbers();


//        Thread 1 executing even numbers
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    printer.oddNumber();
                }
            });

//        Thread 2 executing odd numbers
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    printer.evenNumber();
                }
            });

//        Shutting down the threads in the pool after their work is completed
            pool.shutdown();

        }

}
