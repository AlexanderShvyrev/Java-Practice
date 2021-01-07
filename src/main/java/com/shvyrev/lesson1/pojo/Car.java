package main.java.com.shvyrev.lesson1.pojo;

import java.util.Objects;

public class Car extends Transport {

    public String brand;
    public Boolean isFull;
    public static Boolean isHonda;

    static {
        System.out.println("Hello world from static");
    }

    public Car(String color, Integer price, Boolean isRunning){
        super(color, price, isRunning);
    }


    public void printCost(){
        System.out.println("The price is " + price);
    }
    public void printColor(){
        System.out.println("The color is " + color); //sout shortcut for printLn
    }

    public static void print(){
        System.out.println("Hello world");
    }

    @Override
    public void start(){
        System.out.println("Your car is running now");
        print();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(isFull, car.isFull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, price);
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", isFull=" + isFull +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", isRunning=" + isRunning +
                '}';
    }
}





