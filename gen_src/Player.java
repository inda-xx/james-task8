// Player.java
public class Player {

    // Fields
    private String name; 
    private int positionX;
    private int positionY;
    private int health;

    // Constructor
    public Player(String name, int positionX, int positionY, int health) {}

    // Methods
    public String getName() {}
    public int getPositionX() {}
    public int getPositionY() {}
    public int getHealth() {}
    public void move(String direction) {}
    public void interactWithEnemy(Enemy enemy, Score score) {}
    private boolean isCollidingWith(Enemy enemy) {}
    public static Player loadFromFile(String filePath) throws IOException {}
}