// File: Enemy.java
public class Enemy implements CharacterActions {
    private int position;
    private int size;
    private int health;

    public Enemy(int position, int size, int health) {
        // Constructor
    }

    @Override
    public void move() {
        // Placeholder for moving the enemy
    }

    @Override
    public void interact() {
        // Placeholder for interaction
    }

    // Additional methods and getters/setters here
}

// File: CharacterActions.java
interface CharacterActions {
    void move();
    void interact();
    // Additional method signatures here
}