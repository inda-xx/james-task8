public class Enemy {
    private int id;
    private String name;
    private int health;
    private int x, y;

    public Enemy(int id, String name, int health, int x, int y) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public void attack(Player player) {
        // Logic for attacking the player
        System.out.println(name + " attacks the player!");
    }

    public void defeatedBy(Player player) {
        System.out.println(name + " is defeated!");
        player.increaseScore(10);
    }

    // Getters for details
    public int getId() { return id; }
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getX() { return x; }
    public int getY() { return y; }
}