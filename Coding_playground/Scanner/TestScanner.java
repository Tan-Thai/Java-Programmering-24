package Coding_playground.Scanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a number");
        int number = 0;

        while (number < 18 || number > 60) {
            number = numberCheck(input);
            System.out.println("the number you input is not valid");

        }
        System.out.println("The current input number is " + number);
        
        input.close();
    }

    private static int numberCheck(Scanner input){
        while (!input.hasNextInt()){
            input.nextLine();
            System.out.println("invalid input, please write a number");
        }
        return input.nextInt();
    }

}

