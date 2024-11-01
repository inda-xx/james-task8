public class Enemy implements CharacterActions {
    private int position;
    private int size;
    private int health;

    public Enemy(int position, int size, int health) {
        this.position = position;
        this.size = size;
        this.health = health;
    }

    @Override
    public void move() {
        // Code for moving the enemy
    }

    @Override
    public void interact() {
        // Code for interaction
    }

    // Additional methods and getters/setters here
}