package tutorials_java.chapter_14;

import javax.swing.*;
import java.awt.*;

public class demo {

    public static void main(String[] args) {

        Font font = new Font("Arial", Font.BOLD, 33);
        JFrame frame = new JFrame("Demonstrating Management");
        frame.setSize(250, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel heading = new JLabel("This frame has many components");
        heading.setFont(font);
        JLabel line = new JLabel("Enter your name:");
        line.setFont(new Font("Arial", Font.BOLD, 20));

        JTextField field = new JTextField(10);
        JButton button = new JButton("Click to continue");

        frame.setLayout(new FlowLayout());
        frame.add(heading);
        frame.add(line);
        frame.add(field);
        frame.add(button);




    }


}
