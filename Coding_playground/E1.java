package Coding_playground;

import java.text.MessageFormat;

public class E1 {
    public static void main(String[] args) {
        
        int myAge = 29;
        String myFirstName = "Tan";

        System.out.println("My name is " + myFirstName + " and I am " + myAge + " years old.");
        System.out.println(MessageFormat.format("My name is {0} and I am {1} years old. This was written with string interpolation", myFirstName, myAge));

        boolean allowedValue = false;

        int x = 256;
        byte y = 8;
    }
}
