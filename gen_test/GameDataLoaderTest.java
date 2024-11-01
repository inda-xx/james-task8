package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameDataLoaderTest {
    
    @Test
    public void loadEnemiesFromValidFile() throws IOException {
        String testData = "1, Goblin, 100, 5, 5\n" +
                          "2, Troll, 150, 7, 8\n";
        Path tempFile = Files.createTempFile("enemies", ".csv");
        Files.write(tempFile, testData.getBytes());

        List<Enemy> enemies = GameDataLoader.loadEnemies(tempFile.toString());
        assertTrue(enemies.size() == 2);
        
        Enemy enemy1 = enemies.get(0);
        assertEquals("Goblin", enemy1.getName());
        assertEquals(100, enemy1.getHealth());

        Enemy enemy2 = enemies.get(1);
        assertEquals("Troll", enemy2.getName());
        assertEquals(150, enemy2.getHealth());

        Files.deleteIfExists(tempFile);
    }

    @Test(expected = NumberFormatException.class)
    public void loadEnemiesFromInvalidFile() throws IOException {
        String testData = "Invalid Data\n";
        Path tempFile = Files.createTempFile("enemies", ".csv");
        Files.write(tempFile, testData.getBytes());
        
        GameDataLoader.loadEnemies(tempFile.toString());
    }
}

// PlayerTest.java

import org.junit.Test;
import static org.junit.Assert.assertEquals;

