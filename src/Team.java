/**
 * The Team class represents a team in the AFL game simulation.
 * 
 * It keeps track of various statistics of a team including its name,
 * number of wins, losses, and draws. The name of the team is immutable
 * once set, while the other statistics can be updated.
 * 
 * The class provides methods to retrieve and update team statistics, 
 * as well as to represent the team's data as a string.
 */
public class Team {
    private final String name; // The name of the team, which is immutable once set
    private int wins;   // Number of wins the team has
    private int losses; // Number of losses the team has
    private int draws;  // Number of draws the team has
    
    /**
     * Default constructor that initializes the team with the name "Unnamed Team"
     * and zeroes for the statistical fields.
     */
    public Team() {
        name = "Unnamed Team";
        wins = 0;
        losses = 0;
        draws = 0;
    }
    
    /**
     * Non-default constructor that allows specification of the team's name and initial statistics.
     *
     * @param name The name of the team.
     * @param wins Initial number of wins.
     * @param losses Initial number of losses.
     * @param draws Initial number of draws.
     */
    public Team(String name, int wins, int losses, int draws) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }
    
    // Getters
    public String getName() { return name; }
    public int getWins() { return wins; }
    public int getLosses() { return losses; }
    public int getDraws() { return draws; }

    // Setters (No setter for name)
    public void setWins(int wins) { this.wins = wins; }
    public void setLosses(int losses) { this.losses = losses; }
    public void setDraws(int draws) { this.draws = draws; }
    
    /**
     * Overrides the default toString() method and returns a string representing the Team object.
     *
     * @return A string that contains the team's name and its statistical data (wins, losses, draws).
     */
    public String toString() {
        return "Team Statistics\n" +
               "------------------\n\n" +
               "Team name = " + name + "\n" +
               "Number Of losses = " + losses + "\n" +
               "Number Of Wins = " + wins + "\n" +
               "Number of Draws = " + draws + "\n\n";
    }
}
