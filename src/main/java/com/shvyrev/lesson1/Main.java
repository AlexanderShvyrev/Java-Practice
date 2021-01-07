package main.java.com.shvyrev.lesson1;

import main.java.com.shvyrev.lesson1.pojo.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");

        //primitive types

        //number based data types (default value 0)
        byte x = -28; //range from -128 to 127
        short b = 100; //range from -32XXX to 32XXX
        int num = 10;
        long a = 120; //basically any number
        char y = '!'; //any symbol (in a string)

        //floats default value 0.0
        double n = 21.2;

        //booleans default value is false
        boolean c = true;

        //reference types
        String name = "Alex";
        name = "Gleb"; //deletes Alex and creates Gleb


//        Animal tiger = new Animal("Vasya", 30, true);
//        tiger.run();
//        tiger.isMammal();
//        tiger.returnSpeed(tiger.getSpeed());
//
//
//        Dog sharik= new Dog("Sharik", 10, true, "Sheperd");
//        tiger.run();
//        sharik.run();
//
//        Cat myCat = new Cat("Murka", 15, true);
//        myCat.run();
//
        Dog animalOne = new Dog("Fluff", 100, true, "Poodle");
        animalOne.jump();
        animalOne.digHole();
//        Animal animalTwo = new Cat("Fluffy", 100, true);
//        List <Animal> animalList = new ArrayList();
//        animalList.add(animalOne);
//        animalList.add(animalTwo);
//        for (Animal item : animalList) {
//            item.run();
//            item.isMammal();
//            item.getName();
//        }

//        Car carOne = new Car("blue", 20000, false);
//        Car carTwo = new Car("green", 10000, true);
//        Car carThree = new Car("green", 1001, true);
//
//
//        Airplane airplaneOne = new Airplane("white", 3000000, false);
//        Airplane airplaneTwo = new Airplane("silver", 200000, true, 100, true);
//
//        airplaneTwo.checkCapacity();
//
//        Motorcycle mOne = new Motorcycle("red", 5000, true);
//        Motorcycle mTwo = new Motorcycle(false);
//        Motorcycle mThree = new Motorcycle("red", 2000, true, true, 100);
//
//        mTwo.checkBrand();
//        mThree.checkBrand();
//
//        carOne.equals(carTwo);
//        int x1 = 10;
//        int y1 = 10;
//        System.out.println(carThree == carTwo);
////        System.out.println(carThree.equals(carTwo));
//        String s1 = "Hello";
//        String s2 = "Hello";
//        System.out.println(s1 == s2);
//        String s3 = new String("Hello");
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//
//        carOne.hashCode();
//        System.out.println(carOne.hashCode() + " " + carTwo.hashCode() + " " + carThree.hashCode());
//        System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + s3.hashCode());
//
//        System.out.println(carOne.toString());
//
//        System.out.println(carOne.getClass());
//
//        Car.print(); //static
//
//        carOne.start();

        Person personOne = new Person(33, "Alex", true);
        Person personTwo = new Person(33, "Alex", true);
        Person personThree = new Person();
//        System.out.println(personThree.getAge().equals(10));//error!!! NullPointerException


        System.out.println(personOne==personTwo);
        System.out.println(personOne.equals(personTwo));


        System.out.println(personOne.hashCode() + " " + personTwo.hashCode());
        String s1 = "Hello"; //immutable
        String s2 = "Hello";
        System.out.println(s1 == s2); //only for primitives
        System.out.println(s1.equals(s2));
        String s3 = new String("Hello");
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);

        Jumpable z = new Jumpable() {
            @Override
            public void jump() {
                System.out.println("Hello from anonymous class");
            }
        };
        z.jump();

        Instrumentalist playerOne = new Instrumentalist() {
            @Override
            public void playGuitar() {
                System.out.println("I can play guitar");
            }

            @Override
            public void playPiano() {
                System.out.println("I can play piano");
            }
        };
        playerOne.playGuitar();
        playerOne.playViolin();

        Student studentOne = new Student("Alex", true);
        studentOne.read();
        studentOne.walk();

        //ENUM
        Colors green = Colors.GREEN;
        Colors red = Colors.RED;
        Colors yellow = Colors.YELLOW;

        TrafficLights trafficLights = new TrafficLights();
        trafficLights.setColors(green);



        switch(green){
            case RED:
                System.out.println("Car has stopped");
                break;
            case GREEN:
                System.out.println("You can go");
                break;
            case YELLOW:
                System.out.println("Warning");
                break;
            default:
                System.out.println("Prepare to stop");
        }

        int m = 10;
        switch(m){
            case 1:
                System.out.println("Car has stopped");
                break;
            case 2:
                System.out.println("You can go");
                break;
            case 20:
                System.out.println("Warning");
                break;
            default:
                System.out.println("Prepare to stop");
        }

        int [] nums = new int[10]; //reference type
        nums[0] = 22;
        nums[5] = 11;
        nums[3] = 21;

//        int [] nums = {1, 2, 3};
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        List<Integer> integerList = new ArrayList<>();//16 by default
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
//        for(int i = 0; i<integerList.size(); i++){
//            System.out.println(integerList.get(i));
//        }
//        System.out.println(integerList);
        List<Integer> numbers = new LinkedList<>();

        WeekDays monday = WeekDays.MONDAY;
        WeekDays tuesday = WeekDays.TUESDAY;
        WeekDays wednesday = WeekDays.WEDNESDAY;
        WeekDays thursday = WeekDays.THURSDAY;
        WeekDays friday = WeekDays.FRIDAY;
        WeekDays saturday = WeekDays.SATURDAY;
        WeekDays sunday = WeekDays.SUNDAY;

        List<WeekDays> week = new ArrayList<>();
        week.add(monday);
        week.add(tuesday);
        week.add(wednesday);
        week.add(thursday);
        week.add(friday);
        week.add(saturday);
        week.add(sunday);

        Student studentThree = new Student(week);
        List<WeekDays> schedule = studentThree.getSchedule();
        for(WeekDays day: schedule){
            switch(day){
                case SATURDAY:
                    System.out.println("It's the weekend");
                    break;
                case SUNDAY:
                    System.out.println("It's the weekend");
                    break;
                default:
                    System.out.println("Not weekend");
            }
        }



        for (WeekDays weekDays : schedule) {

            if(weekDays==wednesday){
                break;
            }else{
                System.out.println("not wednesday");
            }

        }


        int s = 0;
        while(s<=10){
            System.out.println("hello");
            s++;
        }

        do { //runs at least once
            //code here
            System.out.println("hello again");

        } while (false);

        Printer <Dog> printDog = new Printer<>();
        printDog.print(animalOne);

//        Printer<Person> printPerson = new Printer<>();
//        printPerson.print(personOne);

        Map<Integer, Person> integerPersonMap = new HashMap<>();

        integerPersonMap.put(1, personOne);
        integerPersonMap.put(2, personTwo);
        integerPersonMap.put(3, personThree);

        System.out.println(integerPersonMap.get(3));


        Map<String, Integer> foods = new HashMap<>();
        foods.put("watermelon", 1);
        foods.put("banana", 2);
        foods.put("cherry", 5);
        foods.put("pear", 10);
        foods.put("cucumber", 324);
        foods.put("blackberry", 34);
        foods.put("zhen shen", 65);
        foods.put("iris", 67);
        foods.put("potato", 89);
//        foods.put("banana", "fruit");

        System.out.println(foods.keySet());//prints all the keys
        System.out.println(foods.values()); //prints values only

        foods.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(123);
        integers.add(11243);
        integers.add(1532);
        integers.add(16524);
        integers.add(1412);
        integers.add(1315);
        integers.add(1);
        integers.add(1);

        Set<Integer> temp = new HashSet<>();
        integers.forEach(xyz->{
            temp.add(xyz);
        });
        System.out.println(temp.size()); //stores only unique values and filters out duplicates


        //NullPointerException
        String f= null;
        try {
            int v= 1/0;
            f.hashCode();

        }catch (NullPointerException e){
            System.out.println("null exception");
        }catch (Throwable e){
            System.out.println("exception");
        }finally {
            System.out.println("In finally block");
        }



        //StackOverflowError
//        animalOne.digHole();


        //Arithmetic Exception
//        int v= 1/0;
    }
}

//instanceof tests if the object is of given type


//Marker interface is an interface with no fields. It tells the compiler about a special behaviour of the class that is implementing it. Serializable, Clonable,
//Remote


