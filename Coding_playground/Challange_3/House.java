package Coding_playground.Challange_3;
import java.text.MessageFormat;

public class House {
    String address;
    int buildYear;
    double squareMeters;
    int floors;
    double value;
    Car car;

    public House() {
        address = "'Address name not yet implemented'";
        buildYear = 1990;
        squareMeters = 120;
        floors = 0;
        value = 0;
    }

    public House(String address, int buildYear, double squareMeters, int floors, double value) {
        this(address, buildYear, squareMeters, floors, value, null);
    }

    public House(String address, int buildYear, double squareMeters, int floors, double value, Car car) {
        this.address = address;
        this.buildYear = buildYear;
        this.squareMeters = squareMeters;
        this.floors = floors;
        this.value = value;
        this.car = car;
    }

    public void printHouseInfo() {
        System.out.println(MessageFormat.format(
        "The house''s address is {0}, built in the year {1} and is {2} square meters in size.\n" +
        "It has {3} floors and currently has a value of {4} Sek.",
        this.address, this.buildYear, this.squareMeters, this.floors, this.value));

        if(car == null) {
            System.out.println("This house does not own a car.");
        } else {
            car.printCarInfo();
        }
    }
}
