package tutorials_java.chapter_8;

import javax.swing.JOptionPane;

public class demo {
    public static void main(String[] args) {

        System.out.println(minimum(4, 2));
        int names[] = new int[4];
        int[] list = new int[4];



    }

   static int minimum(int x, int y) {
        if (x < y) return x;
        else return y;
    }
}


// Returning an array from a method
        /*public static int[] getArray () {
            int[] scores = {90, 80, 70, 60};
            return scores;
        }
        // you can store its returned value in any integer array reference.
        int[] scoresFromMethod = getArray();//
        */

// A for loop with an early exit
        /*for (int x = 0; x < NUMBER_OF_ITEMS; ++x) {
            if (itemOrdered == validValues[x]) {
                isValidItem = true;
                itemPrice = prices[x];
                x = NUMBER_OF_ITEMS
            }} */

// A for loop that uses a compound test for termination
        /*
        for(int x = 0; x < NUMBER_OF_ITEMS && !isValidItem; ++x) {
                if(itemOrdered == validValues[x]) {
                isValidItem = true;
                itemPrice = prices [x];
                          }
                        } */


