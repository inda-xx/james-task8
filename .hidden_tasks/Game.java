import java.util.List;

public class Game {
    private List<Player> players;
    private List<Enemy> enemies;
    private Scoreboard scoreboard;

    public Game(List<Player> players, List<Enemy> enemies) {
        this.players = players;
        this.enemies = enemies;
        this.scoreboard = new Scoreboard();
    }

    public void start() {
        // Game initialization and loop logic
        while (true) {
            for (Player player : players) {
                for (Enemy enemy : enemies) {
                    if (player.collide(enemy)) {
                        player.takeDamage(enemy.getStrength());
                        if (player.getHealth() <= 0) {
                            System.out.println("Player " + player.getName() + " has been defeated!");
                        } else {
                            scoreboard.updateScore(10);
                        }
                    }
                }
            }

            // Break condition for the game loop can be implemented here
        }
    }
    
    public Scoreboard getScoreboard() {
        return scoreboard;
    }
}