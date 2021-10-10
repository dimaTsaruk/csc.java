package lab_4;

/*
* Statement: Count the number of occurrences of a character in a string
* Specifications:
* Input - search string
* Output - the string
*        - the number of characters
*        - the count of each vowel
 */

import javax.swing.*;
public class Vowels {
    public static void main(String[] args) {

        // 0. objects used to store data
        int a_count, e_count, i_count, o_count, u_count;

        // 1. display a descriptive message
        JOptionPane.showMessageDialog(null, "" +
                        "This program asks the user for a sentence,\n" +
                        "searches the sentence for all vowels, \n" +
                        "and displays the number of times each\n" +
                        "vowel appears in the sentence.", "Lab 4 Description",
                JOptionPane.INFORMATION_MESSAGE);
        // 2. initializing all vowel counters to 0
        a_count = e_count = i_count = o_count = u_count = 0;

        // 3. input the character string
        String sentence = JOptionPane.showInputDialog(null,
                "Enter the sentence to search:",
                "Input", JOptionPane.QUESTION_MESSAGE);
        // 4. Visit position 0 through String.length()-1;
        int i = 0;

        /*  5 - 6
        If position "i" of String is a vowel
        increase that vowel's counter by 1  */
        for (i = 0; i < sentence.length(); i++) {
            switch (sentence.charAt(i)) {
                case 'a':
                case 'A':
                    a_count++;
                    break;
                case 'e':
                case 'E':
                    e_count++;
                    break;
                case 'i':
                case 'I':
                    i_count++;
                    break;
                case 'o':
                case 'O':
                    o_count++;
                    break;
                case 'u':
                case 'U':
                    u_count++;
                    break;
                default:
                    break;
            }
        }
        // 7 display the String
        // 8 display the number of characters
        // 9 display the number of each vowel
        String vowelsCounted = "\n\n" + sentence + "\n\nhas "
                + sentence.length() + " characters.\n\nThere are "
                + vcString(a_count, 'a') + vcString(e_count, 'e')
                + vcString(i_count, 'i') + vcString(o_count, 'o')
                + " and " + vcString(u_count, 'u') + ".";

        JOptionPane.showMessageDialog(null, vowelsCounted, "Lab 4 Output",
                JOptionPane.INFORMATION_MESSAGE);

    }

    // method to support formatted output of #vowels
    public static String vcString(int num, char ch) {
        return String.format("%n %2d %1c/'s", num, ch);
    }
}
