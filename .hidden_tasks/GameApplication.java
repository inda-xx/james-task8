import java.util.List;
import java.util.ArrayList;

public class GameApplication {

    public static void main(String[] args) {
        // Load player and enemies from files
        Player player = loadPlayer("player.txt");
        ArrayList<Enemy> enemies = loadEnemies("enemies.txt");

        // Demonstration of game entities
        System.out.println("Player position: (" + player.getX() + ", " + player.getY() + ")");
        for (Enemy enemy : enemies) {
            System.out.println("Enemy position: (" + enemy.getX() + ", " + enemy.getY() + ")");
        }
    }

    public static Player loadPlayer(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            String[] data = line.split(",");
            int x = Integer.parseInt(data[0].trim());
            int y = Integer.parseInt(data[1].trim());
            return new Player(x, y);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Enemy> loadEnemies(String filename) {
        ArrayList<Enemy> enemies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int x = Integer.parseInt(data[0].trim());
                int y = Integer.parseInt(data[1].trim());
                enemies.add(new Enemy(x, y));
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return enemies;
    }
}