package Coding_playground.Lab1.DiceGame;
import java.util.Random;

public class Die {
    private int numberOfSides;
    private int currentValue;
    private Random random = new Random();

    // getters, setters
    public int getNumberOfSides() {
        return numberOfSides;
    }
    public int getCurrentValue() {
        return currentValue;
    }

    // Constructors
    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    // Methods
    public void roll() {
        currentValue = random.nextInt(1, numberOfSides);
    }

    public static void main(String[] args) {
        Die die = new Die(5);

        System.out.println(die.currentValue);
        die.roll();
        System.out.println(die.currentValue);
        die.roll();
        System.out.println(die.currentValue);
        die.roll();
        System.out.println(die.currentValue);


    }
}
