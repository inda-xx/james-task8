import java.util.List;

public class GameManager {

    private Player player;
    private List<Enemy> enemies;

    public GameManager() {
        this.player = new Player();
        this.enemies = GameDataLoader.loadEnemies("enemies.csv");
    }

    public void startGame() {
        // Game initialization logic can be added here
        for (Enemy enemy : enemies) {
            System.out.println("Loaded enemy: " + enemy.getName() + " at position (" + enemy.getX() + ", " + enemy.getY() + ")");
        }

        player.startMovementLoop();
    }

    public void processEnemyInteractions() {
        for (Enemy enemy : enemies) {
            // Logic to check if player is near any enemy and interact accordingly
            if (Math.abs(player.getX() - enemy.getX()) < 2 && Math.abs(player.getY() - enemy.getY()) < 2) {
                player.attack(enemy);
                enemy.defeatedBy(player);
            }
        }
    }
}