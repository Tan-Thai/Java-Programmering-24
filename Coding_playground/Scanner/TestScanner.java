package Coding_playground.Scanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a number");
        
        while (!input.hasNextInt() || input.nextInt() <= 18) {
            System.out.println("input isnt valid, please try again");
            input.next();
        }

        int myInt = input.nextInt();
        
        System.out.println("The current input number is " + myInt);

        // if (numberCheck) {
        //     myInt = scanner.nextInt();
        //     System.out.println("The input number is " + myInt);
        // }
        // else {
        //     System.out.println("Invalid input");
        // }
        
        input.close();
    }

}

