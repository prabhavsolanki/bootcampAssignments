package assignment3.Ans2;

// 2. Write a program to create a thread using Thread class and Runnable interface each.
//      a. Using Thread class

class App extends Thread {

    @Override
    public void run() {
        super.run();

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

public class UsingThreadClass {
    public static void main(String[] args) {
        App thread1 = new App();
        App thread2 = new App();
        thread1.start();
        thread2.start();

    }
}
