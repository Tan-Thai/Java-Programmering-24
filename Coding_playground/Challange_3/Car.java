package Coding_playground.Challange_3;
import java.text.MessageFormat;

public class Car {
    String model;
    double value;
    double distanceTraveled;

    public Car(String model, double value, double distanceTraveled) {
        this.model = model;
        this.value = value;
        this.distanceTraveled = distanceTraveled;
    }

    public void printCarInfo() {
        System.out.println(MessageFormat.format("This house owns a car of the model {0}, valued at {1}Sek and have been driven {2}km.",
        this.model, this.value, this.distanceTraveled));
    }
}
