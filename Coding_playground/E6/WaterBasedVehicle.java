package Coding_playground.E6;
import java.util.Random;

public class WaterBasedVehicle extends Vehicle {
    String gpsPos;


    public WaterBasedVehicle(double weight, double price) {
        super(weight, price);
    }


    public void go() {
        Random random = new Random();

        double latitude = random.nextDouble(180) - 90;
        double longitude = random.nextDouble(360) - 180;

        gpsPos = "Lat: " + latitude + ", Long: " + longitude;
        System.out.println("Going to pos: " + gpsPos);
    }
}
