package assignment3.Ans5;

// 5. Write a program to demonstrate wait and notify methods.


public class Runner {

    public static void main(String[] args) throws InterruptedException {


        Processor proc = new Processor();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.client();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.server();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();
    }

}
