package main.java.com.shvyrev.lesson1.exceptions;

public class NotFoundException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Not found!!!!!!!!!!!!!!!!!!!!!!");
        super.printStackTrace();

    }
}
