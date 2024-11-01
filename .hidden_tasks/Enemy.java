import java.util.List;
import java.util.ArrayList;

public class Enemy {
    private String name;
    private int positionX;
    private int positionY;
    private int health;
    private int damage;

    public Enemy(String name, int positionX, int positionY, int health, int damage) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean takeDamage(int amount) {
        health -= amount;
        return health <= 0;
    }

    public static ArrayList<Enemy> loadEnemiesFromFile(String filePath) throws IOException {
        ArrayList<Enemy> enemies = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int posX = Integer.parseInt(parts[1]);
            int posY = Integer.parseInt(parts[2]);
            int health = Integer.parseInt(parts[3]);
            int damage = Integer.parseInt(parts[4]);
            enemies.add(new Enemy(name, posX, posY, health, damage));
        }
        reader.close();
        return enemies;
    }
}