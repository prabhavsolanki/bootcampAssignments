package assignment3.Ans3;

// 3. Write a program using synchronization block and synchronization method
//      b. Synchronised Method

class Runner implements Runnable{

     synchronized void looper(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    @Override
    public void run() {
        this.looper();
    }
}


public class SynchronisedMethod {

    public static void main(String[] args) {
        Runner runner = new Runner();
        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);
        t1.start();
        t2.start();
    }
}
