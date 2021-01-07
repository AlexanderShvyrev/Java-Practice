package main.java.com.shvyrev.lesson1.pojo;

public class Dog extends Animal implements Runable, Jumpable {
    public String breed;

    public Dog(String name, int speed, boolean isMammal, String breed) {
        super(name, speed, isMammal);
        this.breed = breed;
    }

    @Override
    public void run() {
//        super.run();
        System.out.println("The dog is running");
    }
    @Deprecated
    public void digHole(){
        System.out.println("I'm digging a hole");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
