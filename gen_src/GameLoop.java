// File: GameLoop.java
import java.util.ArrayList;
import java.io.IOException;

public class GameLoop {
    private boolean gameIsRunning;
    private Player player;
    private ArrayList<Enemy> enemies;
    private Score score;

    public GameLoop() throws IOException {
        // Constructor
    }

    public void start() {
        // Start method
    }

    public static void main(String[] args) {
        // Main method
    }
}

// File: Player.java
public class Player {
    public static Player loadFromFile(String fileName) throws IOException {
        // Method signature
        return null;
    }

    public void move(String direction) {
        // Method signature
    }

    public void interactWithEnemy(Enemy enemy, Score score) {
        // Method signature
    }

    public int getHealth() {
        // Method signature
        return 0;
    }
}

// File: Enemy.java
import java.util.ArrayList;
import java.io.IOException;

public class Enemy {
    public static ArrayList<Enemy> loadEnemiesFromFile(String fileName) throws IOException {
        // Method signature
        return null;
    }
}

// File: Score.java
public class Score {
    public int getScore() {
        // Method signature
        return 0;
    }
}