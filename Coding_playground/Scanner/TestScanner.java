package Coding_playground.Scanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a number between 18 to 60");
        int number = 0;

        do {
            while (!input.hasNextInt()) {
                System.out.println("invalid input, please write a number");
                input.next();
            }
            System.out.println("The number you gave is not valid");
            number = input.nextInt();
        }
        while (number <= 18 || number >= 60);
        System.out.println("The current input number is " + number);

        // while (number < 18 || number > 60) {
        //     number = numberCheck(input);
        //     System.out.println("the number you input is not valid");

        // }
        // System.out.println("The current input number is " + number);
        
        input.close();
    }

    // private static int numberCheck(Scanner input){
    //     while (!input.hasNextInt()){
    //         input.next();
    //         System.out.println("invalid input, please write a number");
    //     }
    //     return input.nextInt();
    // }

}

