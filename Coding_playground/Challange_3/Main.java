package Coding_playground.Challange_3;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        House house1 = new House(
                "Briljantgatan 50",
                2020,
                55.5,
                1,
                8000);

        House house2 = new House(
                "Akkas Gata 2",
                1999,
                64,
                1,
                11000);

        Person person1 = new Person(
                "Tan Thai",
                28,
                "male",
                177,
                "student",
                house1);

        Person person2 = new Person(
                "Bo",
                40,
                "male",
                165);

        Person person3 = new Person(
                "Siri",
                23,
                "female",
                158,
                house2);

        System.err.println(person1.house.address);
        System.err.println(person3.house.address);
    }
}
