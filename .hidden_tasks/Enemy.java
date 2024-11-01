public class Enemy {
    private String type;
    private int health;
    private int damage;
    private int points;

    public Enemy(String type, int health, int damage, int points) {
        this.type = type;
        this.health = health;
        this.damage = damage;
        this.points = points;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getDamage() {
        return damage;
    }

    public int getPoints() {
        return points;
    }

    public void defeat() {
        health = 0;
    }
}