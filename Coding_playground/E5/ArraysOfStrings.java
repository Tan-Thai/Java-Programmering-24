package Coding_playground.E5;

public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] collection = {"Gun breaker", "Reaper", "Sage", "Black Mage", "Dark Knight", "Machinist", "Dragoon"};

        int longestWordIndex = 0;
        int longestWordCount = 0;

        for (int i = 0; i < collection.length; i++) {
            if (collection[i].length() > longestWordCount) {
                longestWordIndex = i;
                longestWordCount = collection[i].length();
            }
        }   

        System.out.println("The longest word in the collection is " + collection[longestWordIndex]);
    }
}
