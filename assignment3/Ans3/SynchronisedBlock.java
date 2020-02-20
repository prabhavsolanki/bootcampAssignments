package assignment3.Ans3;

// 3. Write a program using synchronization block and synchronization method
//      a. Synchronised Block

class SynchronizedBlock implements Runnable{
    public void run() {
        synchronized (this) {
            for(int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        SynchronizedBlock s = new SynchronizedBlock();
        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        t1.start();
        t2.start();
    }
}
