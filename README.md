# AFL-Game-Simulator

# AFL Game Simulator

## Below Contains the instructions of the Game on how to build it

## Scenario

Australia has its own code of football known as AFL. You have been tasked with writing an AFL Game Simulator, which is able to simulate the game play of a sequence of AFL games between different pairs of teams, outputting the final score at the end of each game. Each team in the simulation has a name, as well as recorded game statistics (number of wins/losses/draws). Each game in the simulation is played by two teams, each of whom have a current score in that game. The simulator should keep track of the total number of wins, losses, and draws of each team, and output this information at the end of the simulation. 

### Task 1 - Application Design 

You will see that it contains a single empty class, GameDriver. This class will contain the main method of your Java application, which will run the game simulation.

Use the principles of good software design you have learned about to decide on two other class files to represent the key entities in the above scenario, so that your Java application contains three classes in total. Add these two additional class files to your IntelliJ project, giving them meaningful names. For each of these two classes:

- Identify and code the fields they will need.

- Write default and non-default constructors.

- Write getter and setter methods for the fields.

- Write a toString method.

### Task 2 - Constants

A team's name should not be able to be changed, once it has been set.

Any game has two teams that are playing in it, and once these two teams have been set, they cannot be changed.

Use what you have learned about constants in Java to amend your code where needed, so that the implementation of the two points above is ensured.

### Task 3 - Game play simulation

Implement a method called playGame() in the appropriate class in your Java application, which simulates game play, updating scores until the time is up, then updating team data.

The instructions for playing a game are as follows:

There are two ways that a team can score points in AFL:

- Scoring a behind is worth one point.
- Scoring a goal is worth six points.

For every minute that passes during game play, either team has a 14% chance of scoring a goal, and an 18% chance of scoring a behind. (Hint: to calculate the probability of event, generate a random number from 1 to 100. There is a 1% chance of each of these numbers being generated - so, for example, you can nominate numbers 1–14 for scoring a goal, and numbers 15–32 for scoring a behind). 

A game lasts for 80 minutes.

Once a game has finished, the final scores of each team are printed to the console, and the win/lose/draw data for each team is updated.

In designing your method, you should apply the design principles you have learned about where relevant (e.g. modularisation, abstraction, encapsulation, high cohesion, low coupling) to ensure good code quality. 

### Task 4 - Driver class

In the GameDriver class, write a main method which does the following:

Creates 6 teams, whose names are entered by the user.

Simulates 30 games, so that each pair of teams plays against each other exactly twice. Each team should play 10 games in total by the end of the simulation.

Once all games have run, prints the number of wins, losses, and draws for each team.