package main.java.com.shvyrev.lesson1.pojo;

public interface Readable {
    default void read(){
        System.out.println("I'm reading");
    }
}
