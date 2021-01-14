package main.java.com.shvyrev.lesson1.multithreading;

import static main.java.com.shvyrev.lesson1.multithreading.Main4.MONITOR;

public class ThreadPong extends Thread {

    @Override
    public void run() {
        synchronized (MONITOR){
            for(int i =0; i<=10;i++){
                System.out.println("Pong");
                if(i==10){
                    this.interrupt();
                }
                try {
                    MONITOR.notifyAll();
                    MONITOR.wait();
                } catch (InterruptedException e) {
                    System.out.println("Finished");

                }

            }

        }


    }
}
