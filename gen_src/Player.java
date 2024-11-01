// File: Player.java

public class Player implements CharacterActions {
    private int position;
    private int size;
    private int health;

    public Player(int position, int size, int health) {
        // Constructor
    }

    @Override
    public void move() {
        // Move method
    }

    @Override
    public void interact() {
        // Interact method
    }

    // Additional methods and getters/setters
}

// File: CharacterActions.java

public interface CharacterActions {
    void move();
    void interact();
}