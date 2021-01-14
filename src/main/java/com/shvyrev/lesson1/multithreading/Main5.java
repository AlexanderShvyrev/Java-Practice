package main.java.com.shvyrev.lesson1.multithreading;

import java.util.concurrent.*;

public class Main5 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService serviceOne = Executors.newFixedThreadPool(10);

        serviceOne.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from execute");
            }
        });


        Future<Integer> futureInt = serviceOne.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Thread.sleep(5000L);
                return 100;
            }
        });
        System.out.println("Immitating work from main thread");
        System.out.println(futureInt.get());

    }
}
