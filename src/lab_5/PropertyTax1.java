/************************************************************************
 * Name: Dmytro Tsaruk                                            CSC 156
 * Date: 10/19/2021                                               Lab 5
 *************************************************************************
 * Statement: Access content pane to create a visible window
 * Specifications:
 * Input  - none
 *
 * Output - displayed window with 300x400 pixels
 ************************************************************************/
// demonstrates use of swing class methods to access content pane
// declare swing class

package lab_5;

import javax.swing.*;
import java.awt.*;

public class PropertyTax1 extends JFrame {
    // set parameters to define extent of the window
    private static final int WIDTH = 400, HEIGHT = 300;

    public PropertyTax1() {
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(7, 2));

        // set title, size and visibility aspects of window
        setTitle("Calculation of Property Taxes");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel assessL = new JLabel("Assessment Home Value:", SwingConstants.RIGHT);
        JLabel schoolTaxRate = new JLabel("Decimal Value of School Tax Rate:", SwingConstants.RIGHT);
        JLabel countyTaxRate = new JLabel("Decimal Value of County Tax Rate:", SwingConstants.RIGHT);
        JLabel schoolTaxes = new JLabel("School Taxes:", SwingConstants.RIGHT);
        JLabel countyTaxes = new JLabel("County Taxws:", SwingConstants.RIGHT);
        JLabel totalTaxes = new JLabel("Total Taxes:", SwingConstants.RIGHT);

        JTextField assessTF = new JTextField(10);
        JTextField schoolTaxRateTF = new JTextField(10);
        JTextField countyTaxRateTF = new JTextField(10);
        JTextField schoolTaxesTF = new JTextField(10);
        JTextField countyTaxesTF = new JTextField(10);
        JTextField totalTaxesTF = new JTextField(10);

        JButton exit = new JButton("Exit");
        JButton calculate = new JButton("Calculate");

        pane.add(assessL);
        pane.add(assessTF);
        pane.add(schoolTaxRate);
        pane.add(schoolTaxRateTF);
        pane.add(countyTaxRate);
        pane.add(countyTaxRateTF);
        pane.add(schoolTaxes);
        pane.add(schoolTaxesTF);
        pane.add(countyTaxes);
        pane.add(countyTaxesTF);
        pane.add(totalTaxes);
        pane.add(totalTaxesTF);
        pane.add(exit);
        pane.add(calculate);

    }


    public static void main(String[] args) {
        // main program to invoke constructor
        PropertyTax1 proptax = new PropertyTax1();


    }

}
