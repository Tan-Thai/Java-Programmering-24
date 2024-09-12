package Coding_playground;
import java.util.Scanner;
import java.text.MessageFormat;

public class Challange_2 {
    
    private Scanner scanner = new Scanner(System.in);
    public void main(String[] args) {
        Scanner sc = getScanner();
        
        System.out.println("Welcome to this practice program!\nYou will get to choose your actions, please input what you wish to do.");
        
        System.out.println("What do you wish to do?");
        System.out.println("1.Add 2 numbers.\n2.Count letters in a string. \n3.Mirror a string.\n4.The sum of all numbers in a string.");
        System.out.println("Please write a number between 1-4");

        int tempChoiceNum = 0; 
        
        do {
            tempChoiceNum = checkIfNumber(sc);
        } while (tempChoiceNum > 4 || tempChoiceNum == 0);

        sc.nextLine();
        
        System.out.println("The number you chose is " + tempChoiceNum);
        
        switch (tempChoiceNum) {
            case 1:
                System.out.println("You chose option 1");
                addTwoNumbers();
            break;
            
            case 2:
                System.out.println("You chose option 2");

                break;
            
            // case 3:
            // System.out.println("You chose option 3");
            
            // break;
            
            // case 4:
            // System.out.println("You chose option 4");
            
            // break;
            }

        }
        
        public Scanner getScanner(){
            return scanner;
        }
        
        public void addTwoNumbers(){
            Scanner sc = getScanner();
            System.out.println("Please input the two numbers you want to add togehter, starting with the first:");
            int firstNumber = 0;
            int secondNumber = 0;

            firstNumber = checkIfNumber(sc);
            System.out.println("the first number is " + firstNumber);
            secondNumber = checkIfNumber(sc);
            System.out.println("the first number is " + secondNumber);

            System.out.println("The total of the 2 given numbers is " + (firstNumber + secondNumber));
        }

        // https://stackoverflow.com/questions/71872221/java-how-to-use-a-scanner-to-check-that-input-is-an-integer-and-is-within-a-spe



        public int checkIfNumber(Scanner sc){
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input, please write a number");
                sc.nextLine();
            }
            return sc.nextInt();
        }

        public int inputAction(){
            Scanner sc = getScanner();

            int n = 0;
            while (n < 1 || n > 5) {
                n = checkIfNumber(sc);
            }
            return n; 
        }
}
