package Coding_playground;

import java.util.Scanner;
import java.text.MessageFormat;

public class Challange_2 {

    private Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
        Scanner sc = getScanner();
        char chosenOption;

        System.out.println(
                "Welcome to this practice program!\nYou will get to choose your actions, please input what you wish to do.");
        do {
            System.out.println("What do you wish to do?");
            System.out.println(
                    "1.Add 2 numbers.\n2.Count letters in a string. \n3.Mirror a string.\n4.The sum of all numbers in a string.");
            System.out.println("Please write a number between 1-4 or e to exit. --");

            chosenOption = optionChecker(sc);

            System.out.println("-----------\nYou chose option " + chosenOption);
            switch (chosenOption) {
                case '1':
                    caseOne();
                    break;

                case '2':
                    caseTwo();
                    break;

                case '3':
                    caseThree();
                    break;

                case '4':
                    caseFour();
                    break;

                case 'e':
                    System.out.println("Exiting program, good bye.");
                    return;
            }
            System.out.println("\n--------Returning to the main menu--------");

        } while (chosenOption != 'e');
    }

    public Scanner getScanner() {
        return scanner;
    }

    public char optionChecker(Scanner sc) {
        do {
            String inputString = sc.nextLine().trim();
            if (inputString.length() == 1) {
                char choice = inputString.charAt(0);

                if ((choice >= '1' && choice <= '4') || choice == 'e') {
                    return choice;
                }
            }
            System.out.println("Invalid input, please enter a number between 1-4 or e to exit.");
        } while (true); // tvingar en loop tills användaren har skrivit rätt.
    }

    public void caseOne() {
        Scanner sc = getScanner();
        System.out.println("Please input the two numbers you want to add togehter, starting with the first:");
        int firstNumber = 0;
        int secondNumber = 0;

        firstNumber = checkIfNumber(sc);
        System.out.println("the first number is " + firstNumber);
        secondNumber = checkIfNumber(sc);
        System.out.println("the first number is " + secondNumber);

        System.out.println("The total of the 2 given numbers is " + (firstNumber + secondNumber));
        sc.nextLine();
    }

    public void caseTwo() {
        Scanner sc = getScanner();
        char c;
        String inString;

        System.out.print("Write the word you wish to go through: ");
        inString = sc.nextLine();
        System.out.print("Write the letter you want to search for: ");
        c = sc.nextLine().charAt(0);

        int numOfOccurences = 0;
        for (int i = 0; i < inString.length(); i++) {
            char comparison = inString.charAt(i);
            if (comparison == c) {
                numOfOccurences++;
            }
        }
        System.out.println("There's " + numOfOccurences + " " + c + " in the word " + inString);
    }

    public void caseThree() {
        // https://stackoverflow.com/questions/58942938/reversing-a-string-from-users-input
        // good explanation
        Scanner sc = getScanner();
        String inString, reverseString = "";

        System.out.print("Write the word you wish to mirror: ");
        inString = sc.nextLine();

        for (int i = inString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + inString.charAt(i);
        }
        System.out.println(reverseString);
    }

    public void caseFour() {
        Scanner sc = getScanner();
        System.out.print("Please enter a string of numbers: ");

        String inputString = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (!isDigit(c)) {
                System.out.println("This string contains a letter, please input a string of only numbers.");
                return; // atm only returning you to main menu, want it to loop ideally.
            }
            sum += c - 48; // can you write '0' because its 48 in the ASCII number?
        }
        System.out.println("The total sum of all the number in the string is: " + sum);
    }

    public int checkIfNumber(Scanner sc) {
        // https://stackoverflow.com/questions/71872221/java-how-to-use-a-scanner-to-check-that-input-is-an-integer-and-is-within-a-spe
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input, please write a number");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
    
     /* public int inputAction() {
     * Scanner sc = getScanner();
     * 
     * int n = 0;
     * while (n < 1 || n > 5) {
     * n = checkIfNumber(sc);
     * }
     * return n;
     * }
     */
}
