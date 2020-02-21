package assignment3;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.*;

// 7. Run a task with the help of callable and store it's result in the Future.

public class Ans7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<Long> future = executor.submit(new Callable<Long>() {

            @Override
            public Long call() throws Exception {
                Random random = new Random();
                Integer duration = random.nextInt(5000);
                System.out.println("Starting...");
                long start = System.currentTimeMillis();

                for (int i = 0; i < 2500; i++){
                    Thread.sleep(1);
                };

                long end = System.currentTimeMillis();
                System.out.println("Finished");
                return end-start;
            }
        });

        System.out.println("Defined sleep duration: 2500s");
        System.out.println("Actual sleep duration: " + future.get() + "s");

        executor.shutdown();
    }
}
