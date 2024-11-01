import java.util.List;
import java.util.ArrayList;

public class GameDataLoader {

    public static List<Enemy> loadEnemies(String filename) {
        List<Enemy> enemies = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int health = Integer.parseInt(parts[2]);
                int x = Integer.parseInt(parts[3]);
                int y = Integer.parseInt(parts[4]);
                enemies.add(new Enemy(id, name, health, x, y));
            }
        } catch (IOException e) {
            System.err.println("Error reading enemies file: " + e.getMessage());
        }
        return enemies;
    }
}