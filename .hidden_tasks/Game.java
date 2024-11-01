import java.util.List;

public class Game {
    private Player player;
    private List<Enemy> enemies;

    public Game(Player player, List<Enemy> enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    public void start() {
        while (true) {
            // Basic game loop for moving player and handling interactions
        }
    }
}