import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class Enemy {
    private String name;
    private int positionX;
    private int positionY;
    private int health;
    private int damage;

    public Enemy(String name, int positionX, int positionY, int health, int damage) {
        // Constructor implementation here
    }

    public String getName() {
        // Method implementation here
    }

    public int getPositionX() {
        // Method implementation here
    }

    public int getPositionY() {
        // Method implementation here
    }

    public int getHealth() {
        // Method implementation here
    }

    public int getDamage() {
        // Method implementation here
    }

    public boolean takeDamage(int amount) {
        // Method implementation here
    }

    public static ArrayList<Enemy> loadEnemiesFromFile(String filePath) throws IOException {
        // Method implementation here
    }
}