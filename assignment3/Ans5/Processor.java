package assignment3.Ans5;

// 5. Write a program to demonstrate wait and notify methods.

public class Processor {
    Integer total = 1;

    public void client() throws InterruptedException {
        synchronized (this){
            System.out.println("Client Thread running");
            Thread.sleep(500);
            System.out.println("Client sending control to server");
            Thread.sleep(200);
//          Thread is paused and allows other threads to access this synchronised block
            wait();
            System.out.println("Client resumed. Shutting down");
        }

    }

    public void server() throws InterruptedException {
        synchronized (this){
            System.out.println("------ Server Loading ------");
            for (int i = 0; i < 28; i++) {
                System.out.print("-");
                Thread.sleep(200);
            }
            System.out.println("\nServer ready; Sending control back to client");
            Thread.sleep(200);
            notify();
//          Control goes back to thread that invoked wait()
        }
    }
}
