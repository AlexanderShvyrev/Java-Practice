package main.java.com.shvyrev.lesson1.pojo;

import java.util.Objects;

public class Person {
    private Integer age;
    private String name;
    private Boolean isMale;

    static {
        System.out.println("Hello");
    }

    public Person(Integer age, String name, Boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public Person() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getAge(), person.getAge()) &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(isMale, person.isMale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), isMale);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
