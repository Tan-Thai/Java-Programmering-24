package Coding_playground.E6;

public class AirborneVehicle extends Vehicle {

    public AirborneVehicle(double weight, double price) {
        super(weight, price);
    }

    public void fly(boolean isFlying) {
        if (isFlying) {
            System.out.println("Command to keep flying given.");
        } else {
            System.out.println("Command to land the vehicle given.");
        }
    }


}
