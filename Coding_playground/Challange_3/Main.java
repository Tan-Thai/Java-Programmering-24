package Coding_playground.Challange_3;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        House house1 = new House(
                "Briljantgatan 50",
                2020,
                55.5,
                1,
                8000,
                new Car("Toyota", 100000, 2000));

        House house2 = new House(
                "Akkas Gata 2",
                1999,
                64,
                1,
                11000,
                new Car("Volvo", 153000, 52300));

        Person person1 = new Person("Tan Thai",28,"male",177,"student",house1);
        Person person2 = new Person("Bo",40,"male",165);
        Person person3 = new Person("Siri",23,"female",158,house2);

        person1.printPersonInfo();
        person1.house.printHouseInfo();

        person2.printPersonInfo();

        person3.printPersonInfo();
        person3.house.printHouseInfo();

    }
}
