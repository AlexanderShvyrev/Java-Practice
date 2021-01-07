package main.java.com.shvyrev.lesson1.pojo;

import java.util.List;

public class Student implements Readable, Walkable {
    private String name;
    private Boolean isPlaying;
    private List<WeekDays> schedule;

    public Student(String name, Boolean isPlaying) {
        this.name = name;
        this.isPlaying = isPlaying;
    }

    public Student(List<WeekDays> schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPlaying() {
        return isPlaying;
    }

    public void setPlaying(Boolean playing) {
        isPlaying = playing;
    }
    @Override
    public void walk(){
        System.out.println("The student is walking");
    }

    public List<WeekDays> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<WeekDays> schedule) {
        this.schedule = schedule;
    }
}
