package Coding_playground.Ex4;
import java.util.Scanner;

public class myMathMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempInput;

        System.out.print("Enter a number to calc factorial: ");
        tempInput = checkIfNumber(sc);
        System.out.println("Factorial of " + tempInput + " is " + calculateFactorial(tempInput));

        sc.nextLine();

        System.out.print("Please input a number to calc fibonacci: ");
        tempInput = checkIfNumber(sc);
        System.out.println("The fibonacci number for " + tempInput + " is: " + calculateFibonacci(tempInput));

        sc.nextLine();

        System.out.print("Please input to check if it's a prime number: ");
        tempInput = checkIfNumber(sc);
        System.out.println(isPrime(tempInput) ?
        "The number " + tempInput + " is a prime number." :
        "The number " + tempInput + " is NOT a prime number."
        );

        sc.nextLine();
        sc.close();
    }

    public static int checkIfNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input, please write a number");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public static long calculateFactorial(int inputNumber) {
        // https://stackoverflow.com/questions/891031/is-there-a-method-that-calculates-a-factorial-in-java
        if (inputNumber == 0) {return 1;}
        if (inputNumber < 0) {
            System.out.println("The number is below 0 and can't have a factorial");
            return 0;}

        long result = 1;
        for (int factor = 2; factor <= inputNumber; factor++) {
            result *= factor;
        }
        return result;
    }

    public static int calculateFibonacci(int inputNumber) {
        // yoink - recursion https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
        if (inputNumber == 1 || inputNumber == 0) {return inputNumber;}
        if (inputNumber < 0) {
            // Could maybe use a throw here.?
            System.out.println("The number must be in the positives");
            return 0;
        }
        
        return calculateFibonacci(inputNumber - 1) + calculateFibonacci(inputNumber - 2);
    }

    public static boolean isPrime(int inputNumber) {
        if (inputNumber <= 1) return false; //man i forget that {} isn't needed for single lines
        
        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0) return false;
        }
        return true;
        // prolly a more optimised code somewhere on overflow but ill look that up later.
        // TODO: `look up improvements
    }
}
