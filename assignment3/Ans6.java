package assignment3;

// 6. Write a program to demonstrate sleep and join methods.


public class Ans6 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner(), "t1");
        Thread t2 = new Thread(new Runner(), "t2");
        Thread t3 = new Thread(new Runner(), "t3");

//      Starting first thread
        t1.start();

//      Start second thread only after first is dead
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

//      Start third thread only when first thread is dead
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
//      let all threads finish execution before finishing main thread
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads are dead, exiting main thread");
    }

}

class Runner implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }

}
