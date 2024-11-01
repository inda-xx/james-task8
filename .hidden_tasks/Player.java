public class Player {
    private String name;
    private int health;
    private int score;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void increaseScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return score;
    }
}