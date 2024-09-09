

import java.util.Locale;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        //Algorithm:
        //     1. Ask for inputs
        //      2. ignore case, compare values
        //      3. output winner
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1: rock, scissors, paper: \n");

//        // RoCk, rOCK, ROCk = rock
//        String player1Selection = input.nextLine().toLowerCase();
//        String player2Selection = input.nextLine().toLowerCase();
        String player1Choice = input.nextLine(); // {    rock  }
        player1Choice = player1Choice.trim().toLowerCase(); //now its {rock}     (no spaces before/after)

        //CHECK INPUT TO SEE IF IT IS rock, paper, or scissors
        // if not print "WRONG CHOICE"
        if (player1Choice.equals("rock") || player1Choice.equals("paper") || player1Choice.equals("scissors")) {
        } else {
            System.out.println("WRONG CHOICE.");
        }

        System.out.print("Player 2: rock, scissors, paper: \n");
        String player2Choice = input.nextLine();
        player2Choice = player2Choice.trim().toLowerCase();

        //CHECK INPUT TO SEE IF IT IS rock, paper, or scissors
        // if not print "WRONG CHOICE"
        if (player2Choice.equals("rock") || player2Choice.equals("paper") || player2Choice.equals("scissors")) {
        } else {
            System.out.println("WRONG CHOICE.");
        }

        // DRAW
        if (player1Choice.equals(player2Choice)) {
            System.out.println("It is a tie.");
        }
        // Player 1 selects rock
        if (player1Choice.equals("rock")) {
            if (player2Choice.equals("paper")) {
                System.out.println("Player 2 wins");
            } else if (player2Choice.equals("scissors")) {
                System.out.println("Player 1 Wins");
            }
        }
        //Player 1 selects paper
        if (player1Choice.equals("paper")) {
            if (player2Choice.equals("scissors")) {
                System.out.println("Player 2 wins");
            } else if (player2Choice.equals("rock")) {
                System.out.println("Player 1 Wins");
            }
        }
        //Player 1 selects scissors
        if (player1Choice.equals("scissors")) {
            if (player2Choice.equals("rock")) {
                System.out.println("Player 2 wins");
            } else if (player2Choice.equals("paper")) {
                System.out.println("Player 1 Wins");
            }
        }
    }
}