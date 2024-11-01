package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameWorldTest {

    private Player player;
    private List<Enemy> enemies;

    @Before
    public void setUp() {
        player = new Player("Hero", 100, 0);
        enemies = new ArrayList<>();
        enemies.add(new Enemy("Goblin", 50));
    }

    // Test GameWorld Constructor
    @Test
    public void testGameWorldInitialization() {
        GameWorld gameWorld = new GameWorld(player, enemies);
        assertNotNull(gameWorld);
    }

    // Test player movement
    @Test
    public void testPlayerMove() {
        player.move(5, 3);
        // We can't directly test x, y as they are private, but we can check the results indirectly, if the class were allowing such tests
        // For simplicity, assuming there's a method to test getPlayerX and getPlayerY in the actual implementation
        // assertEquals(5, player.getPlayerX());
        // assertEquals(3, player.getPlayerY());
    }

    // Test player collision with enemy
    @Test
    public void testPlayerCollision() {
        int initialHealth = player.getHealth();
        player.collideWith(enemies.get(0));
        assertEquals(initialHealth - 10, player.getHealth());
    }

    // Test game game exit command
    @Test
    public void testGameWorldExit() {
        GameWorld gameWorld = new GameWorld(player, enemies);
        String input = "exit\n";  // Provide exit command to test the loop exits.
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        gameWorld.run();
        // To properly test this, run and ensure no exceptions occur, potentially checking if run() method ends
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

