package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameDataLoaderTest {

    @Test
    public void testLoadValidEnemies() {
        GameDataLoader loader = new GameDataLoader("valid_enemies.txt");
        List<Enemy> enemies = loader.getEnemies();
        assertEquals(2, enemies.size());
        assertEquals("Goblin", enemies.get(0).getName());
        assertEquals(30, enemies.get(0).getHealth());
        assertEquals(5, enemies.get(0).getAttackPower());
    }

    @Test
    public void testLoadEnemiesWithInvalidFile() {
        GameDataLoader loader = new GameDataLoader("invalid_file.txt");
        List<Enemy> enemies = loader.getEnemies();
        assertTrue(enemies.isEmpty());
    }

    @Test
    public void testLoadEnemiesWithInvalidFormat() {
        GameDataLoader loader = new GameDataLoader("invalid_format.txt");
        List<Enemy> enemies = loader.getEnemies();
        assertTrue(enemies.isEmpty());
    }
}

// GameTest.java
import org.junit.Test;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.List;

