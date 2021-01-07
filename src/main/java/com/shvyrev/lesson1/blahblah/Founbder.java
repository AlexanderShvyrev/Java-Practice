package main.java.com.shvyrev.lesson1.blahblah;

import main.java.com.shvyrev.lesson1.exceptions.NotFoundException;

import java.util.HashMap;

public class Founbder {
    public static HashMap<String, String> tets = new HashMap<>();
    public static void found(String k) throws NotFoundException {
        String result = tets.get(k);
        if(result==null){
            throw new NotFoundException();
        }
    };
}
