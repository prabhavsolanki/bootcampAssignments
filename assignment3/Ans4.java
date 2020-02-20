package assignment3;

import java.util.concurrent.ExecutorService;

class PrintNumbers {
    void evenNumber(){
        for (int i = 1; i <= 20; i+=2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    void oddNumber(){
        for (int i = 0; i <= 20; i+=2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class Ans4 {
    ExecutorService execu
}
