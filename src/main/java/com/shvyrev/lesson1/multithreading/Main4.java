package main.java.com.shvyrev.lesson1.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Main4 {
    public static final String MONITOR = "Monitor";
    public volatile static AtomicInteger BALANCE = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        ThreadPing thread1 = new ThreadPing();
        ThreadPong thread2 = new ThreadPong();



        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++) {
                    BALANCE.incrementAndGet();
                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++) {
                    BALANCE.incrementAndGet();
                }
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException e) {
                        System.out.println("Hello from thread 5");
                    }
                    System.out.println("Hi, I'm a daemon");
                }
            }
        });
        thread5.setDaemon(true);
        thread5.start();
        thread3.start();
        thread4.start();


        thread3.join();
        thread4.join();
        System.out.println("Balance: " + BALANCE);
    }

}
