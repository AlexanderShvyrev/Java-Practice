package main.java.com.shvyrev.lesson1.pojo;

public class Printer <T extends Animal> {
    public void print(T type){
        System.out.println(type);
    }
}
