package lab_3;

/* Statement: Test the Patient class with overloaded
           constructors, accessors and mutators
        *
        * Specifications: all Panel I/O
        * Input  - Patient ID
        *        - Patient Age
        * Output - Patient attributes based upon constructors
        *        - Patient attributes supported by input and mutators
        *        - Sum of Patient's ages supported by accessors

 */


import javax.swing.JOptionPane;

public class Healthcare {
    // delcaration of the main()
    public static void main(String[] args) {
        // delcaration of variable used for input
        String idNumber, strAge;
        int patientAge;

        // 1 instantiate object using the default constructor
        Patient p1 = new Patient();

        // 2 modify to instantiate object using the parameterized constructor
        Patient p2 = new Patient("1234", 35, "B", "+");

        // 3 instatiate a BloodData object
        BloodData b = new BloodData("AB", "-");

        // 4 output an informational message
        JOptionPane.showMessageDialog(null,
                "This program uses a Patient class that has a BloodData class as\n"
                        + "one of its data attributes.  It demonstrates constructor overload,\n"
                        + "accessor and mutator methods as well as overloading of the\n"
                        + "toString() method using the String.format() method.",
                "Lab 3 Description", JOptionPane.INFORMATION_MESSAGE);

        // 5 display default attributes using Patient.toString()
        JOptionPane.showMessageDialog(null, p1,
                "Default Constructor", JOptionPane.INFORMATION_MESSAGE);

        // 6 display user defined attributes using Patient.toString()
        JOptionPane.showMessageDialog(null, p2,
                "Parameterized Constructor", JOptionPane.INFORMATION_MESSAGE);


        // 7 prompt the user for ID and Age
        idNumber = JOptionPane.showInputDialog("Enter a patient ID number");
        strAge = JOptionPane.showInputDialog("Enter a patient age value");


        // 8 convert the String representation of Age to int
        patientAge = Integer.parseInt(strAge);

        // 9 update the data attributes of p1
        p1.setID(idNumber);
        p1.setAge(patientAge);
        p1.setBD(b);


        // 10 display mutated attributes using Patient.toString()
        JOptionPane.showMessageDialog(null, p1,
                "Mutated Attributes", JOptionPane.INFORMATION_MESSAGE);

        // 11 display the sum of the patient's ages
        JOptionPane.showMessageDialog(null, "Sum of patient's ages = "
                        + (p1.getAge() + p2.getAge()), "Patient's Ages",
                JOptionPane.INFORMATION_MESSAGE);

    }

}
