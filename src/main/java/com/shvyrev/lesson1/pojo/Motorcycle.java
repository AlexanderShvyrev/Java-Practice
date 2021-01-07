package main.java.com.shvyrev.lesson1.pojo;

public class Motorcycle extends Transport {

    public Boolean isHarley = false;
    public Integer speed;


    public Motorcycle(String color, Integer price, Boolean isRunning){
        super(color, price, isRunning);
    }

    public Motorcycle(Boolean isHarley) {
        this.isHarley = isHarley;
    }

    public Motorcycle(String color, Integer price, Boolean isRunning, Boolean isHarley, Integer speed) {
        super(color, price, isRunning);
        this.isHarley = isHarley;
        this.speed = speed;
    }

    @Override
    public void start(){
        System.out.println("Your motorcycle is running now");
    }

    public void checkBrand(){
        if(isHarley){
            System.out.println("It is " + isHarley + " that this motorcycle is Harley");
        }else{
            System.out.println("Not Harley :(");
        }

    }

    public void handlebars(){
        System.out.println("I can ride my bike with no handlebars!");
    }
}
