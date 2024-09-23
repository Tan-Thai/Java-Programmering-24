package Coding_playground.Challange_3;

import java.text.MessageFormat;

public class Person {
    String name;
    int age;
    String gender;
    double height;
    String occupation;
    House house;

    public Person() {
        name = "Jane Doe";
        age = 20;
        gender = "female";
        height = 160;
        occupation = "N/A";
    }

    public Person(String name, int age, String gender, double height) {
        this(name, age, gender, height, "N/A", null);
    }

    public Person(String name, int age, String gender, double height, String occupation) {
        this(name, age, gender, height, occupation, null);
    }

    public Person(String name, int age, String gender, double height, House house) {
        this(name, age, gender, height, "N/A", house);
    }

    public Person(String name, int age, String gender, double height, String occupation, House house) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.occupation = occupation;
        this.house = house;
    }

    public void printPersonInfo() {
        System.out.println(MessageFormat.format(
                "{0} is {1} year''s old. Their gender is {2} and measures at {3}cm''s tall.",
                this.name, this.age, this.gender, this.height));

        System.out.println((this.occupation.equals("N/A")) ? "They currently don't have any occupation"
                : "They currently have an occupation as a(n) " + this.occupation + ".");

        System.out.println(
                (this.house == null) ? "They are currently homeless." : "They live in the house " + this.house + ".");
    }
}
