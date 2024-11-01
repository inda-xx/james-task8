import java.util.List;
import java.util.Scanner;

public class GameWorld {
    private List<Enemy> enemies;
    private Player player;
    private Scanner scanner;

    public GameWorld(Player player, List<Enemy> enemies) {
        this.player = player;
        this.enemies = enemies;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("Enter command (move/collide/exit):");
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "move":
                    System.out.println("Move in x and y:");
                    int dx = scanner.nextInt();
                    int dy = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    player.move(dx, dy);
                    break;
                case "collide":
                    if (!enemies.isEmpty()) {
                        player.collideWith(enemies.get(0)); // Example collision
                    }
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    public static void main(String[] args) {
        try {
            GameDataLoader loader = new GameDataLoader();
            List<Player> players = loader.loadPlayers("players.txt");
            List<Enemy> enemies = loader.loadEnemies("enemies.txt");

            if (!players.isEmpty()) {
                GameWorld world = new GameWorld(players.get(0), enemies);
                world.run();
            }
        } catch (IOException e) {
            System.out.println("Error loading game data: " + e.getMessage());
        }
    }
}