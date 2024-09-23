package Coding_playground.Ex4;
import java.util.Scanner;

public class myStringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tempInput;

        System.out.print("Write the word you wish to mirror: ");
        tempInput = sc.nextLine();
        System.out.println("The reversed string is: " + reverseString(tempInput));
        
    }

    public static String reverseString(String inputString) {
        // https://stackoverflow.com/questions/58942938/reversing-a-string-from-users-input
        // good explanation
        String reverseString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }
        return reverseString;
    }
}
