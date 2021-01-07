package main.java.com.shvyrev.lesson1.blahblah;

import main.java.com.shvyrev.lesson1.exceptions.NotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {
        try {
            List<String> result = Files.readAllLines(Path.of("/Users/alexandershvyrev/Desktop/School/My Projects/JAVA/Lesson_1/src/resources/sample.txt"));
//            result.forEach(r->{
//                System.out.println(r);
//            });
            for (String s : result) {
                System.out.println(s);
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            Files.writeString(Path.of("/Users/alexandershvyrev/Desktop/School/My Projects/JAVA/Lesson_1/src/resources/sample2.txt"), "This is the second file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Finder finder = new Finder();
        try {
            finder.find("+++++++++++++++++++");

        } catch (NotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("in finally block");
        }
    }
}
