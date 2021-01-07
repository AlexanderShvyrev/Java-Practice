package main.java.com.shvyrev.lesson1.pojo;

public class Cat extends Animal implements Runable {
    public Cat(String name, int speed, boolean isMammal) {
        super(name, speed, isMammal);
    }

    @Override
    public void run() {
        System.out.println("The cat is running");
    }
}
