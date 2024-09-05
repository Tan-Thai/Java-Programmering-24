package Coding_playground;

import java.text.MessageFormat;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        //#region Base Assignments 1.1 - 1.9
        int myAge = 29;
        String myFirstName = "Tan";

        System.out.println("My name is " + myFirstName + " and I am " + myAge + " years old.");
        System.out.println(MessageFormat.format(
                "My name is {0} and I am {1} years old. This was written with string interpolation", myFirstName,
                myAge));

        // 1.4, 1.5
        boolean allowedValue = false;

        int x = 256;
        byte y = 8;

        // a. A single byte can only contain a certain range -128 to 127. So 256 would
        // not be able to convert to a byte
        // b. The inverse of the previous question but a INT can contain a larger range,
        // which includes all potential byte numbers.

        /* 1.6
         * a. Yes
         * b. Yes
         * c. No, an int wants a number and not letters/characters.
         * d. No, the variablename includes a special character (%).
         * e. No, a bool can only be set to 1/0 > True/False.
         * f. Yes
         * g. No, int cant contain decimals
         * h. Yes
         * i. No, a byte cant contain more than 127 (in the positive scale)
         * j. No, a char should only contain a single letter.
         */

        /* 1.7
         * Ship calypso = new Ship(); <- would write this normally but im too lazy to
         * create a new class file.
         * 
         * a. It should be an object of "Ship", or an unique entity of ship in other
         * words.
         * b. It's a reference ID for that specific entity of "Ship".
         * c. It would be the same reference ID as Calypso since it copied that specific
         * entity.
         * d. Refer to answer above.
         */

        // 1.8
        int x8 = 8;
        int y24 = 24;

        /* b. No, because it would declare both new variables with the same name.
         * If you want to change an existing variable, then just declare its name and
         * not a typing.
         * 
         * 1.9
         * a. 17
         * b. 11
         * c. 56
         * d. 90
         * e. true
         * f. false
         * g. true
         * h. true (?)
         * i. false, or error
         * j. true
         * k. false
         * l. true
         * m. false
         */

        //#endregion

        /* EXTRA STARTS HERE 1.6 + 1.9
         * 
         * 1.6 EXTRA
         * a. No, its an int, cannot use letters
         * b. Yes
         * c. Yes, though just use math.pi
         * d. Yes, but i feel like its a no? It returns ? and not an error, so im not
         * sure.
         * e. Yes, because youre essentially creating a string with numbers. tho it
         * cannot be calculated unless typecasted. (just use int)
         * f. Yes, I pressume that it converts 'A' to a ascii/unicode number. In this
         * case 97
         * g. No, bool > only works with true and false
         * h. No, double can contain a larger count over float. tho most cases it works.
         * i. No, byte can only contain up to 128.
         * j. Yes? It converts 65 to 'A'. so im guessing its the american grading
         * system?
         * k. No, should be "" and not single ''.
         * I. No, bool True/False. as much as 1/0 could be seen as true and false, its
         * bound to lead to confusion.
         * m. No, decimals, use double
         * n. Yes
         * o. No, double quotation marks "" and not ''
         * p. Yes, and honestly one of the most common bool names ever.
         * q. No, too large of a number
         * r. Yes
         * s. Yes, though it will be "AliceBob" since neither had a space behind or in
         * front respectively
         * t. Yes. it will take the 5th letter in this case, 4+1(add on an extra due to
         * counting in 0)
         * 
         * 1.9
         * a. 5
         * b. 1
         * c. 12
         * d. 12
         * e. 17
         * f. 1
         * g. 4
         * h. 4
         * i. false
         * j. true
         * k. false
         * l. false - A and B are the correct ASCII numbers, but this line said that B
         * IS NOT 66.
         * m. True
         * n. True
         * o. True
         * p. True
         * q. True
         * r. True
         * s. True
         * t. False
         */

        //#region SLIGHTLY MORE CHALLENGING EXERCISES. 1.10 - 1.19
        // 1.10
        System.out.println("------------ Assignment 1.10 ------------");
        int a = 10, b = 20, c = 30;
        System.out.println("" + a + b + c); // added "" to create a string, otherwise i wouldve had to print multiple
                                            // times
        System.out.println(MessageFormat.format("{0},{1},{2}", a, b, c)); // more proper formating

        int average = 0;
        average = (a + b + c) / 3;
        System.out.println("The average is " + average);

        // 1.11
        System.out.println("------------ Assignment 1.11 ------------");
        boolean isRaining = true;
        boolean isCold = true;

        checkWeather(isCold, isRaining);

        isCold = false;
        System.out.println("It got Warmer!");
        checkWeather(isCold, isRaining);

        System.out.println((isCold && isRaining) ? ("is cold ternary") : ("is warm ternary"));

        // 1.12
        System.out.println("------------ Assignment 1.12 ------------");
        String firstName12 = "Tan";
        String lastName12 = "Thai";
        String fullName12 = firstName12 + " " + lastName12;

        System.out.println("Full name: " + fullName12 + ", Length: " + fullName12.length());

        // 1.13
        System.out.println("------------ Assignment 1.13 ------------");
        int x13 = 15;
        int y13 = 4;
        double quotient13 = x13 / y13;
        int remainder13 = x13 % y13;

        System.out.println("Quotient: " + quotient13 + ", Remainder: " + remainder13);
        quotient13 = x13 / (double) y13;
        System.out.println("Quotient: " + quotient13 + ", Remainder: " + remainder13);

        // d. it adds in the .75 that was missing in the division.

        // 1.14
        System.out.println("------------ Assignment 1.14 ------------");
        int value14 = 15;
        // System.out.println((value14 % 2 == 0) ? ("1.14: Is even"):("1.14: Is odd"));
        if (value14 % 2 == 0) {
            System.out.println(
                    (value14 > 10) ? ("1.14: Is even and greater than 10") : ("1.14: Is even and lower than 10"));
        } else {
            System.out.println(
                    (value14 > 10) ? ("1.14: Is odd and greater than 10") : ("1.14: Is odd and lower than 10"));
        }

        // 1.15
        System.out.println("------------ Assignment 1.15 ------------");
        String sentence = "Hello my name is The Tan"; // added random "The" to test the functions.
        int index = sentence.toLowerCase().indexOf("the");
        if (index != -1) {
            System.out.println("The word 'the' was found at index nr: " + index);
        } else {
            System.out.println("The word 'the' was NOT found.");
        }

        String modifiedSentence = sentence.replaceAll("(?i)\\bthe\\b", "a");
        System.out.println("Modded sentence " + modifiedSentence);

        // 1.16
        System.out.println("------------ Assignment 1.16 ------------");
        int a16 = 1;
        int b16 = 2;
        int c16 = 3;
        int tempNum = a16;

        a16 = b16;
        b16 = c16;
        c16 = tempNum;

        System.out.println(MessageFormat.format("New values after rot: a = {0}, b = {1}, c = {2}", a16, b16, c16));

        // 1.17
        Scanner sc = new Scanner(System.in);

        int tempChoiceNum = 0;

        System.out.println("------------ Assignment 1.17 ------------");
        System.out.println("Please input a number above 0");

        do {
            while (!sc.hasNextInt()) {
                System.out.println("invalid input, please write a number");
                sc.next();
            }
            System.out.println("The number you gave is not valid");
            tempChoiceNum = sc.nextInt();
        } while (tempChoiceNum < 1);

        sc.close();

        int sum17 = (tempChoiceNum * (tempChoiceNum + 1)) / 2;
        System.out.println("1.17 sum of natural numbers: " + sum17);

        // 1.18
        System.out.println("------------ Assignment 1.18 ------------");
        String originalString = "This is quite a random string of text.";

        int countedNumOfWords = originalString.split(" ").length;
        System.out.println("Original text: " + originalString);
        System.out.println("Counted words: " + countedNumOfWords);

        // borrowed code from https://www.scaler.com/topics/reverse-a-sentence-in-java/
        System.out.println("This is the reverse sentence: " + reverseString(originalString));

        // 1.19
        System.out.println("------------ Assignment 1.19 ------------");

        //#endregion
    }

    public static void checkWeather(boolean isCold, boolean isRaining) {
        if (isCold && isRaining) {
            System.out.println("Stay inside, it's cold and rainy goddamnit.");
        } else {
            System.out.println("Nah dude, you're fine. Get out there.");
        }
    };

    public static String reverseString(String texString) {

        int x = texString.indexOf(" ");
        if (x == -1) {
            return texString;
        }

        return reverseString(texString.substring(x + 1)) + " " + texString.substring(0, x);
    }
}
