package Coding_playground.E6;

public class GroundVehicle extends Vehicle {
    int kms;

    public GroundVehicle(double weight, double price) {
        super(weight, price);
    }

    public void drive(int kms) {
        this.kms += kms;
        System.out.println("Driven: " + this.kms + "km. ");
    }
}
