// Authors: Ekramul Islam
//ID: 33275548
//Unit Code: FIT1051 Java Programming


import java.util.Scanner;


/**
 * The GameDriver class is responsible for orchestrating the AFL game simulation.
 * This includes creating teams, simulating games, and printing the results.
 * 
 * The main responsibilities are divided into three steps:
 * 1. Creating teams based on user input.
 * 2. Simulating games such that each team plays against every other team twice.
 * 3. Printing the final results, including the number of wins, losses, and draws for each team.
 */

public class GameDriver {
    /**
     * The main method serves as the entry point for the application.
     * It handles the orchestration of the game simulation.
     *
     * @param args command-line arguments (not used in this application).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team[] teams = new Team[6];

        // Step 1: Create teams
        // Loop through six iterations to create six teams.
        for (int i = 0; i < 6; i++) {
            // Prompt the user to enter a name for the team.
            System.out.println("Enter name for team " + (i + 1) + ":");
            String teamName = scanner.nextLine();
            // Create a new Team object with the entered name and initial scores of zero.
            teams[i] = new Team(teamName, 0, 0, 0);
        }

        // Step 2: Simulate games
        // Outer loop iterates through all teams.
        for (int i = 0; i < teams.length; i++) {
            // Inner loop iterates through all teams after the current team.
            for (int j = i + 1; j < teams.length; j++) {
                // Additional loop for two games per team pair.
                for (int game = 0; game < 2; game++) {
                    // Create a Game object for the current pair of teams and simulate the game.
                    Game currentGame = new Game(teams[i], teams[j], 0, 0);
                    currentGame.playGame();
                }
            }
        }

        // Step 3: Print results
        // Display a header for the final results.
        System.out.println("\nFinal Results:");
        // Iterate through each team and print their final statistics.
        for (Team team : teams) {
            System.out.println(team.toString());
        }

        // Close the Scanner object to prevent resource leaks.
        scanner.close();

        System.out.println("-----------------------------");
        System.out.println("     **** Game Ended ****");
        System.out.println("**** Thanks For Joining! ****"); 
        System.out.println("-----------------------------");
    }
}
