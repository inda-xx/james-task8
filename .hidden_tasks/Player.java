public class Player {
    private String name;
    private int health;
    private int score;
    private int x;
    private int y;

    public Player(String name, int health, int score) {
        this.name = name;
        this.health = health;
        this.score = score;
        this.x = 0;
        this.y = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void collideWith(Enemy enemy) {
        health -= 10; // Example damage value
        System.out.println("Collided with enemy! Health is now: " + health);
    }
}