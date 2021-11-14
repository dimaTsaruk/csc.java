package lab_7;

/************************************************************************
 * Name: Dmytro Tsaruk                                             CSC 156
 * Date: 14 Nov                                                    Lab 7
 *************************************************************************
 * Statement: Determine the winner of a bowling match
 * Specifications: using parallel arrays
 * Input  - bowling.txt
 *        - Team, Member, Score
 * Output - Winning Team, Members and Scores
 ************************************************************************/

// java class for file I/O

import java.io.*;
import java.util.*;

// declaration of the class
public class Bowling7 {

    // declaration of main program
    public static void main(String[] args) throws FileNotFoundException {

        // 1. connect to input file
        Scanner fin = new Scanner(new File("//Users//guess//Desktop//bowling.txt"));

        // declare arrays below
        String Team, Member;
        int teamw, teamb, Score;

        String[] blue_members = new String[10], white_members = new String[10];
        int[] blue_scores = new int[10], white_scores = new int[10];

        // 2) initialize array accumulators to zero
        teamw = 0;
        teamb = 0;


        // 3) display a descriptive message
        System.out.println(
                "This program reads the lines from the file bowling.txt to determine\n"
                        + "the winner of a bowling match.  The winning team, members and scores\n"
                        + "are displayed on the monitor.\n");

        // 4) test Scanner end of file condition
        while (fin.hasNext()) {
            // 5) attempt to input next line from file
            Member = fin.next();
            Team = fin.next();
            Score = fin.nextInt();
            // 6) test team color is blue
            if (Team.equals("Blue")) {
                // 7) then store blue member and score
                blue_members[teamb] = Member;
                blue_scores[teamb] = Score;
                // 8) increase blue array accumulator
                teamb++;
            } else {
                // 9) else store white member and score
                white_members[teamw] = Member;
                white_scores[teamw] = Score;
                // 10) increase white array accumulator
                teamw++;

            }
        }

        // 11) if blue team score is larger
        if (sumArray(blue_scores, teamb) > sumArray(white_scores, teamw)) {

            // 12) then display blue team as winner
            System.out.println("Blue team is winner!");
            printArray(blue_members, blue_scores, teamb);

            System.out.print("Total team's score: " + sumArray(blue_scores, teamb));

        } else {

            // 13) else display white team as winner
            System.out.println("White team is winner!");
            printArray(white_members, white_scores, teamw);

            System.out.print("Total team's score: " + sumArray(white_scores, teamw));
        }

        // 14) disconnect from the input file
        fin.close();

    }

    // implement method sumArray() below
    /* 1. initialize accumulator to 0
   2. loop over initialized array indices
      3. increase accumulator by indexed array element
   4. return accumulator
*/
    static int sumArray(int array_name[], int array_end) {
        int sum = 0;
        for (int i = 0; i < array_end; i++)
            sum += array_name[i];
        return sum;

    }


    // implement method printArray() below
/* 1. display  the team name as the winner
   2. loop over initialized array indices
      3. display member and score for that array index
*/
    static void printArray(String array_name[], int[] team_scores, int array_end) {
        for (int i = 0; i < array_end; i++)
            System.out.println(array_name[i] + " " + team_scores[i]);
    }

} // end of the class
