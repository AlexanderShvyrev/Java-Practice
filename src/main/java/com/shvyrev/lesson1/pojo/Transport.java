package main.java.com.shvyrev.lesson1.pojo;

public class Transport {
    protected String color;
    protected Integer price;
    protected Boolean isRunning;


    public Transport() {
    }

    public Transport(String color, Integer price, Boolean isRunning) {
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getRunning() {
        return isRunning;
    }

    public void setRunning(Boolean running) {
        isRunning = running;
    }

    public void start(){
        System.out.println("Your machine is running now");
    }

    final public void stop(){
        System.out.println("Your machine is not running anymore");
    }

}
