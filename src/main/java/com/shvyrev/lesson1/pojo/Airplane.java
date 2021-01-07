package main.java.com.shvyrev.lesson1.pojo;

public class Airplane extends Transport {

    public Integer capacity;

    public Boolean isBoeing;


    public Airplane(String color, Integer price, Boolean isRunning){
        super(color, price, isRunning);
    }

    public Airplane(String color, Integer price, Boolean isRunning, Integer capacity, Boolean isBoeing) {
        super(color, price, isRunning);
        this.capacity = capacity;
        this.isBoeing = isBoeing;
    }

    @Override
    public void start(){
        System.out.println("Your airplane is running now");
    }

    public void fly(){
        System.out.println("We are flying now");
    }

    public void checkCapacity(){
        System.out.println("This plane's capacity is " + capacity);
    }

    public void checkIfRunning(){
        System.out.println("Airplane is running?: " + isRunning);
    }
}
