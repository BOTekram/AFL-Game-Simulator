import java.util.Random;

/**
 * The Game class represents a single game of AFL played between two teams.
 * 
 * It handles the simulation of gameplay, scoring, and updating the team data (wins, losses, draws)
 * based on the final score of the game.
 * 
 * The class maintains two Team objects representing the competing teams and scores for each team.
 * The scores are updated during the simulation of the game, and the team data is updated once
 * the game concludes.
 */

public class Game {
    private final Team team1; // team1 is immutable now
    private final Team team2; // team2 is immutable now
    private int scoreTeam1;
    private int scoreTeam2;
    
    /**
     * Default constructor that initializes team objects and sets initial scores to 0.
     */
    public Game() {
        team1 = new Team();
        team2 = new Team();
        scoreTeam1 = 0;
        scoreTeam2 = 0;
    }
    
    /**
     * Non-default constructor that takes two Team objects and initial scores as parameters.
     *
     * @param team1 Team object representing the first team.
     * @param team2 Team object representing the second team.
     * @param scoreTeam1 Initial score for team1.
     * @param scoreTeam2 Initial score for team2.
     */
    public Game(Team team1, Team team2, int scoreTeam1, int scoreTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }
    
    // Getters
    public Team getTeam1() { return team1; }
    public Team getTeam2() { return team2; }
    public int getScoreTeam1() { return scoreTeam1; }
    public int getScoreTeam2() { return scoreTeam2; }

    // Setters (No setters for team1 and team2)
    public void setScoreTeam1(int scoreTeam1) { this.scoreTeam1 = scoreTeam1; }
    public void setScoreTeam2(int scoreTeam2) { this.scoreTeam2 = scoreTeam2; }
    
    /**
     * Overrides the default toString() method and returns a string representing the Game object.
     *
     * @return A string that contains the names of the teams and their respective scores.
     */
    public String toString() {
        return "Game between " + team1.getName() + " and " + team2.getName() + 
               ". Final Score: " + scoreTeam1 + " - " + scoreTeam2;
    }

    

    /**
     * The playGame method simulates a game of AFL, updating scores for each team
     * and ultimately updating the win/loss/draw data of the participating teams.
     * 
     * The method simulates 80 minutes of gameplay, where each team has a chance to score
     * either a goal or a behind in each minute.
     */
    public void playGame() {
        Random random = new Random();
    
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Welcome to " + team1.getName() + " vs " + team2.getName() + "!");
        System.out.println("The game is about to start!");
    
        // Simulate 80 minutes of game
        for(int minute = 0; minute < 80; minute++) {
            // Team 1
            int chance = random.nextInt(100) + 1;
            if(chance <= 14) { // 14% chance of scoring a goal
                scoreTeam1 += 6;
            } else if(chance <= 32) { // 18% chance of scoring a behind
                scoreTeam1 += 1;
            }
    
            // Team 2
            chance = random.nextInt(100) + 1;
            if(chance <= 14) {
                scoreTeam2 += 6;
            } else if(chance <= 32) {
                scoreTeam2 += 1;
            }
        }
    
        // Update team data and display final score
        updateTeamData();
        System.out.println("Game over!");
        if(scoreTeam1 > scoreTeam2) {
            System.out.println(team1.getName() + " wins!");
        } else if(scoreTeam1 < scoreTeam2) {
            System.out.println(team2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
        System.out.println("Final score: " + team1.getName() + " " + scoreTeam1 + " - " + scoreTeam2 + " " + team2.getName() + "\n");
    }
    

    /**
     * The updateTeamData method updates the win/loss/draw data of the teams
     * based on the final score after the game concludes.
     */
    private void updateTeamData() {
        if(scoreTeam1 > scoreTeam2) {
            team1.setWins(team1.getWins() + 1);
            team2.setLosses(team2.getLosses() + 1);
        } else if(scoreTeam1 < scoreTeam2) {
            team2.setWins(team2.getWins() + 1);
            team1.setLosses(team1.getLosses() + 1);
        } else {
            team1.setDraws(team1.getDraws() + 1);
            team2.setDraws(team2.getDraws() + 1);
        }
    }

}
