import java.util.List;
import java.util.ArrayList;

public class GameDataLoader {
    public List<Player> loadPlayers(String filename) throws IOException {
        List<Player> players = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 3) continue;
                String name = data[0];
                int health = Integer.parseInt(data[1]);
                int score = Integer.parseInt(data[2]);
                players.add(new Player(name, health, score));
            }
        }
        return players;
    }

    public List<Enemy> loadEnemies(String filename) throws IOException {
        List<Enemy> enemies = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 2) continue;
                String name = data[0];
                int health = Integer.parseInt(data[1]);
                enemies.add(new Enemy(name, health));
            }
        }
        return enemies;
    }
}