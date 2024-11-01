import java.util.List;
import java.util.ArrayList;

public class LevelLoader {
    private List<Level> levels;

    public LevelLoader(String filename) {
        levels = new ArrayList<>();
        loadLevels(filename);
    }

    private void loadLevels(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                // Assume data format is: levelId, enemyCount, playerStartPosition, etc.
                int levelId = Integer.parseInt(data[0]);
                int enemyCount = Integer.parseInt(data[1]);
                int playerStartPosition = Integer.parseInt(data[2]);
                Level level = new Level(levelId, enemyCount, playerStartPosition);
                levels.add(level);
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading level data: " + e.getMessage());
        }
    }

    public List<Level> getLevels() {
        return levels;
    }
}

class Level {
    private int levelId;
    private int enemyCount;
    private int playerStartPosition;

    public Level(int levelId, int enemyCount, int playerStartPosition) {
        this.levelId = levelId;
        this.enemyCount = enemyCount;
        this.playerStartPosition = playerStartPosition;
    }

    // Getters and additional methods
}