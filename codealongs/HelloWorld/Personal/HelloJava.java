package codealongs.HelloWorld.Personal;

import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        frame.setSize(350, 250);
        JLabel label = new JLabel("Hello, mTestaren!", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
