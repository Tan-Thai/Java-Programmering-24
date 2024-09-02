package Coding_playground.Strayfolder;

import java.text.MessageFormat;

public class TestFile {
    public static void main(String[] args) {
       final String test = "test";
       System.out.println(test);

       String first = "Interpolation";
       String second = "Java";
       System.out.println(MessageFormat.format("String {0} in {1} with some {1} examples.", first, second));

    }
}
