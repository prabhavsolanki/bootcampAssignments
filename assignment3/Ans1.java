package assignment3;

// 1. Write a program do to demonstrate the use of volatile keyword.

import java.util.Scanner;

class Processor extends Thread {

//    Variable 'running' is made volatile so that its value doesn't get cached inside the thread.
    private volatile boolean running = true;

    public void run(){
        while (running){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Press return to stop");
        }
    }

//    shutdown() un-sets the value of running, thereby causing the thread to stop
    public void shutdown(){
        running = false;
    }
}

public class Ans1 {

    public static void main(String[] args) {

        Processor proc = new Processor();
        proc.start();

//        Input from user causes the shutdown() to be called thereby stopping the thread
        Scanner scr = new Scanner(System.in);
        scr.nextLine();

        proc.shutdown();
    }
}