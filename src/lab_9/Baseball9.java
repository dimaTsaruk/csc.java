package lab_9;
/************************************************************************
 * Name: Dmytro Tsaruk                                             CSC 156
 * Date: Nov 24                                                    MP 8
 *************************************************************************
 * Calculate statistics for a baseball team using an array of objects
 ************************************************************************/

// java class for file I/O

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// declaration of the class
public class Baseball9 {

    // implementation of main program
    public static void main(String[] args) throws FileNotFoundException {

        // 1) connect to input file
        // new Scanner(new File("/home/user/file.txt"))
        Scanner fin = new Scanner(new File("src/lab_9/baseball"));

        // objects used to store data
        final int LIST_LENGTH = 20;

        int number = 0,         // number, hits, walks, outs
                hits,
                walks,
                outs,
                players,
                index,
                teamSize = 0;


        // 2) output descriptive messages
        System.out.println("This program tracks a baseball player's number "
                + "and their\nnumber of walks, runs and outs for "
                + "each game in a season.\n");


        // 3) declare an array of LIST_LENGTH players
        Player team[] = new Player[LIST_LENGTH];

        // 3a) loop over the teamsize
        for (int i = 0; i < team.length; i++)

            // 3b) instantiate the i'th team member
            team[i] = new Player();


        // 4)  loop on end of file
        while (fin.hasNext()) {
            // 5) attempt to input the data for the next Player
            number = fin.nextInt();
            hits = fin.nextInt();
            walks = fin.nextInt();
            outs = fin.nextInt();

            // 6) find the index of this Player's number
            index = findNumber(team, number, teamSize);

            // 7) if player number is not in the list
            if (index < 0) {

                // 7a) set the Number field for team[teamSize]
                team[teamSize].setOuts(outs);

                // 7b) set the Hits field for team[teamSize]
                team[teamSize].setHits(hits);

                // 7c) set the Walks field for team[teamSize]
                team[teamSize].setWalks(walks);

                // 7d) set the Outs filed for team[teamSize]
                team[teamSize].setNumber(number);

                // 7e) increase teamSize by 1
                teamSize++;
            }

            // 8) else player number is in the list
            else {

                // 8a) update the Hits field for team[index]
                team[index].setHits(hits + team[index].getHits());

                // 8b) update the Walks field for team[index]
                team[index].setWalks(walks + team[index].getWalks());

                // 8c) update the Outs field for team[index]
                team[index].setOuts(outs + team[index].getOuts());

            }
        }


        // 9) display the results
        System.out.println("Before sorting");
        displayArray(team, teamSize);

        // sort an array
        bubbleSort(team, teamSize);

        // print sorted array
        System.out.println("After sorting");
        displayArray(team, teamSize);


        // 10) disconnect from input file
        fin.close();

    } // end of main

// *************************************************************************
// determine the position within an array of Player of a player's index number
// performs a sequential search from the beginning of the array
// returns -1 on a failure to find an index within the array
//**************************************************************************

    public static int findNumber(Player[] team, int number, int team_size) {
        // 1) assume that this player_ number is not in the list
        int Save = -1;
        // 2) loop over the list length
        for (int i = 0; i < team_size - 1; i++) {
            // 3) exit the loop if the number is found
            if (number == team[i].getNumber()) {
                // 4) update the index on successful search
                Save = i;
                // 5) return either the found index or -1
            }
        }
        return Save;
    }


    //************************************************************************
// display players in an array of Player with formatting of
// Player #, Number of Hits, Number of Walks, Number of Outs
//************************************************************************
    public static void displayArray(Player[] team, int team_size) {
        // 1) display headins of colums
        System.out.println("\nPlayer\tHits\tWalks\tOuts\n"
                + "------\t----\t-----\t----\n");
        // 2) loop over team size
        for (int i = 0; i < team_size; i++) {
            // 3) display i'th player
            System.out.println(team[i] + "\t\t");
        }
        System.out.println();
    }

    // Bubble Sort Algorithm for sorting array of Players
    public static void bubbleSort(Player team[], int teamSize) {
        for (int k = 0; k < teamSize - 2; k++) {
            for (int j = 0; j < teamSize - 1 - k; j++)
                if (team[j].getNumber() > team[j + 1].getNumber()) {
                    Player temp = team[j];
                    team[j] = team[j + 1];
                    team[j + 1] = temp;
                }
        }
    }


}// end of the class




































