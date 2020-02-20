package assignment3.Ans2;

// 2. Write a program to create a thread using Thread class and Runnable interface each.
//      a. Using Runnable interface

class Runner implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

    }
}

public class UsingRunnableInterface {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);
        t1.start();
        t2.start();
    }
}
