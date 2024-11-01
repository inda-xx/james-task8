import java.util.List;
import java.util.ArrayList;

public class GameLoop {
    private boolean gameIsRunning;
    private Player player;
    private ArrayList<Enemy> enemies;
    private Score score;

    public GameLoop() throws IOException {
        this.player = Player.loadFromFile("player.txt");
        this.enemies = Enemy.loadEnemiesFromFile("enemies.txt");
        this.score = new Score();
        this.gameIsRunning = true;
    }

    public void start() {
        while (gameIsRunning) {
            // Simulate player movement based on input (hardcoded for this example)
            player.move("right");
            // Check interactions between player and enemies
            for (Enemy enemy : enemies) {
                player.interactWithEnemy(enemy, score);
            }
            // Render game state (placeholder printout)
            System.out.println("Player Score: " + score.getScore());
            if (player.getHealth() <= 0) {
                gameIsRunning = false;
                System.out.println("Game Over!");
            }
        }
    }

    public static void main(String[] args) {
        try {
            GameLoop game = new GameLoop();
            game.start();
        } catch (IOException e) {
            System.err.println("Failed to initialize game: " + e.getMessage());
        }
    }
}