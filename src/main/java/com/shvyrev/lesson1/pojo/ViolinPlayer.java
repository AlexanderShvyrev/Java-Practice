package main.java.com.shvyrev.lesson1.pojo;

public interface ViolinPlayer {
    default void playViolin(){
        System.out.println("I can play on violin");
    }
}
