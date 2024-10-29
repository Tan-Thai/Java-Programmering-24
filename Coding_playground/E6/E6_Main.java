package Coding_playground.E6;

public class E6_Main {
    
    public static void main(String[] args) {
        
        Car car = new Car(15040, 10000);
        car.drive(30);

        Boat boat = new Boat(50000, 1602000);
        boat.go();

        Helicopter helicopter = new Helicopter(1200, 1000203);
        helicopter.fly(true);

    }

}
