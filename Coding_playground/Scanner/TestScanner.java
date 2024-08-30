package Coding_playground.Scanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myInt;
        System.out.println("Please input a number");

        if (scanner.hasNextInt()) {
            myInt = scanner.nextInt();
            System.out.println("The input number is " + myInt);
        }
        else {
            System.out.println("Invalid input");
        }
        
        scanner.close();
    }

}

