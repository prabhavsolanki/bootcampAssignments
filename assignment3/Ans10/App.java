package assignment3.Ans10;

// 10. Write a program which creates deadlock between 2 threads

public class App {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[]) {
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
        T1.start();
        T2.start();
    }

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (Lock1) {

//                Thread 1 is holding on to lock 1 and wont leave it until it get a hold of lock 2
                System.out.println("Thread 1: Holding lock 1...");

                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }
    private static class Thread2 extends Thread {
        public void run() {
            synchronized (Lock2) {

//                Thread 2 is holding on to lock 2 and wont leave it until it get a hold on lock 2
                System.out.println("Thread 2: Holding lock 2...");

                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}
