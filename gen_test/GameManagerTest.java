package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameManagerTest {
    
    private GameManager gameManager;
    private MockEnemy mockEnemy;
    
    @Before
    public void setUp() {
        mockEnemy = new MockEnemy(1, "TestEnemy", 100, 1, 1);
        gameManager = new GameManager() {
            @Override
            protected List<Enemy> loadEnemies() {
                List<Enemy> enemies = new ArrayList<>();
                enemies.add(mockEnemy);
                return enemies;
            }
        };
    }

    @Test
    public void loadEnemiesNoFile() {
        GameDataLoader gameDataLoader = new GameDataLoader();
        List<Enemy> enemies = gameDataLoader.loadEnemies("nonexistentfile.csv");
        assertTrue(enemies.isEmpty());
    }
    
    @Test
    public void processEnemyInteractionsTest() {
        Player player = new Player();
        player.moveRight(); // Player is at (1, 0)
        player.moveUp();    // Player is at (1, -1)
        player.moveDown();  // Player is at (1, 0)
        player.moveDown();  // Player is at (1, 1) - same as mockEnemy
        
        int initialScore = player.getScore();
        gameManager.processEnemyInteractions();
        
        assertEquals(initialScore + 10, player.getScore());
        assertTrue(mockEnemy.isDefeated());
    }
    
    @Test
    public void enemyPositionInitialization() {
        List<Enemy> enemies = gameManager.getEnemies();
        Enemy testEnemy = enemies.get(0);
        assertEquals("TestEnemy", testEnemy.getName());
        assertEquals(1, testEnemy.getX());
        assertEquals(1, testEnemy.getY());
    }
    
    // Mock class for Enemy to test interactions
    private class MockEnemy extends Enemy {
        private boolean defeated = false;
        
        public MockEnemy(int id, String name, int health, int x, int y) {
            super(id, name, health, x, y);
        }
        
        @Override
        public void defeatedBy(Player player) {
            defeated = true;
            player.increaseScore(10);
        }
        
        public boolean isDefeated() {
            return defeated;
        }
    }
}

// GameDataLoaderTest.java

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

