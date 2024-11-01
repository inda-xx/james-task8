// Player.java
public class Player {
    private String name;
    private int health;
    private int score;

    public Player(String name, int health, int score) {
        // Constructor
    }

    public String getName() {
        // Return name
    }

    public int getHealth() {
        // Return health
    }

    public int getScore() {
        // Return score
    }

    public void move(String direction, GameState gameState) {
        // Move player
    }

    public void interactWithEnemy(Enemy enemy) {
        // Interact with enemy
    }
}

// GameState.java
public class GameState {
    public Room getCurrentRoom() {
        // Return current room
    }

    public void setCurrentRoom(Room room) {
        // Set current room
    }
}

// Room.java
public class Room {
    public Room go(String direction) {
        // Return new room
    }

    public void lookAround() {
        // Look around the room
    }
}

// Enemy.java
public class Enemy {
    public boolean isAlive() {
        // Return if enemy is alive
    }

    public int getDamage() {
        // Return enemy damage
    }

    public int getPoints() {
        // Return enemy points
    }

    public void defeat() {
        // Defeat enemy
    }
}