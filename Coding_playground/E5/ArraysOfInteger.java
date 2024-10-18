package Coding_playground.E5;
import java.util.Random;
import java.util.Arrays;

public class ArraysOfInteger { //Legit hate this setup of code, never doing it again. changed it due to the solutions file.
    int[] intArray;

    public ArraysOfInteger(int arraySize) {
        Random random = new Random();
        intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++ ) {
            intArray[i] = random.nextInt(100);
        }
    }

    void swapRandomElement() {
        Random random = new Random();
        int index1 = random.nextInt(this.intArray.length);
        int index2 = random.nextInt(this.intArray.length);

        int temp = this.intArray[index1];
        intArray[index1] = intArray[index2];
        intArray[index2] = temp;
    }

    void squareRandomElement() {
        Random random = new Random();
        int index = random.nextInt(intArray.length);
        intArray[index] = intArray[index] * intArray[index];

    }

    public static void main(String[] args) {
        ArraysOfInteger collection = new ArraysOfInteger(10);
        System.out.println(Arrays.toString(collection.intArray));
    
        collection.swapRandomElement();
        System.out.println(Arrays.toString(collection.intArray));

        collection.squareRandomElement();
        System.out.println(Arrays.toString(collection.intArray));
        
    }
}

