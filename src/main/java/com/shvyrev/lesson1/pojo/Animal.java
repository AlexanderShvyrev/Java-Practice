package main.java.com.shvyrev.lesson1.pojo;


//incapsulation
public abstract class Animal { //if abstract you cannot create a new Animal
    protected String name;
    protected Integer speed;
    protected Boolean isMammal;
//    public static String nickname;


    public Animal(String name, int speed, boolean isMammal) {
        this.name = name;
        this.speed = speed;
        this.isMammal = isMammal;

    }

    public Animal() {
    }

    public Animal(String name, boolean isMammal) {
        this.name = name;
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>0){
            this.speed = speed;
        }else{
            System.out.println("Error! Speed has to be greater than zero");
        }

    }

    public boolean isMammal() {
        System.out.println("Is mammal?: " + isMammal);
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }

//    public abstract void run(); //you have to override it in child Classes

    public int returnSpeed(int speed){
        return speed += 10;
    }

}
