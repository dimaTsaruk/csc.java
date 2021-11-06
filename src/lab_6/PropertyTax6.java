package lab_6;
/************************************************************************
 * Name: Dmytro Tsaruk                                            CSC 156
 * Date: Nov 11                                                   Lab 6:
 *************************************************************************
 * Statement: Access content pane to create a visible window
 * Specifications:
 * Input  - none
 *
 * Output - displayed window with 300x400 pixels
 ************************************************************************/
// demonstrates use of swing class methods to access content pane
// declare swing class

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PropertyTax6 extends JFrame {

    JTextField assessTF = new JTextField(10);
    JTextField schoolTaxRateTF = new JTextField(10);
    JTextField countyTaxRateTF = new JTextField(10);

    JTextField schoolTaxesTF = new JTextField(10);
    JTextField countyTaxesTF = new JTextField(10);
    JTextField totalTaxesTF = new JTextField(10);

    JButton exit = new JButton("Exit");
    JButton calculate = new JButton("Calculate");

    // set parameters to define extent of the window
    private static final int WIDTH = 400, HEIGHT = 300;

    public PropertyTax6() {
        ExitHandler ebHandler = new ExitHandler();
        CalculateHandler cbHandler = new CalculateHandler();

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
        JLabel countyTaxes = new JLabel("County Taxes:", SwingConstants.RIGHT);
        JLabel totalTaxes = new JLabel("Total Taxes:", SwingConstants.RIGHT);


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

        exit.addActionListener(ebHandler);
        calculate.addActionListener(cbHandler);

    }

    public static void main(String[] args) {
        // main program to invoke constructor
        PropertyTax6 proptax = new PropertyTax6();
    }

    class ExitHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    class CalculateHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double assessD = Double.parseDouble(assessTF.getText());
            double schoolTaxRateTFD = Double.parseDouble(schoolTaxRateTF.getText());
            double countyTaxRateTFD = Double.parseDouble(countyTaxRateTF.getText());

            double schoolTax = assessD * (schoolTaxRateTFD / 100);
            double countyTax = assessD * (countyTaxRateTFD / 100);
            double totalTax = schoolTax + countyTax;

            schoolTaxesTF.setText("" + String.format("%.2f", schoolTax));
            countyTaxesTF.setText("" + String.format("%.2f", countyTax));
            totalTaxesTF.setText("" + String.format("%.2f", totalTax));

        }
    }

}

