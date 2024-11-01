import java.util.List;
import java.util.ArrayList;

public class GameDataLoader {
    private List<Enemy> enemies;

    public GameDataLoader(String filename) {
        enemies = new ArrayList<>();
        loadEnemiesFromFile(filename);
    }

    private void loadEnemiesFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            while (line != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int health = Integer.parseInt(parts[1]);
                    int attackPower = Integer.parseInt(parts[2]);
                    Enemy enemy = new Enemy(name, health, attackPower);
                    enemies.add(enemy);
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Failed to read enemies from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in file: " + e.getMessage());
        }
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}