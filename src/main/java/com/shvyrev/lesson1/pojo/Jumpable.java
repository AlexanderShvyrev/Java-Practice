package main.java.com.shvyrev.lesson1.pojo;

public interface Jumpable {
    default void jump(){
        System.out.println("I'm jumping");
    }
}
