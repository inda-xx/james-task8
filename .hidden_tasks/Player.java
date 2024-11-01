import java.util.List;
import java.util.ArrayList;

public class Player {
    private String name;
    private int speed;
    private int positionX;
    private int positionY;
    private int health;

    public Player(String name, int speed, int positionX, int positionY, int health) {
        this.name = name;
        this.speed = speed;
        this.positionX = positionX;
        this.positionY = positionY;
        this.health = health;
    }

    public static List<Player> loadPlayersFromFile(String fileName) {
        List<Player> players = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(",");
                String name = attributes[0];
                int speed = Integer.parseInt(attributes[1]);
                int positionX = Integer.parseInt(attributes[2]);
                int positionY = Integer.parseInt(attributes[3]);
                int health = Integer.parseInt(attributes[4]);
                players.add(new Player(name, speed, positionX, positionY, health));
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return players;
    }

    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
    }

    public boolean collide(Enemy enemy) {
        return this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY();
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    // Additional getters and setters can be added here
}