package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterActionsTest {
    
    @Test
    public void testPlayerCreation() {
        Player player = new Player(10, 5, 100);
        assertEquals(10, player.position);
        assertEquals(5, player.size);
        assertEquals(100, player.health);
    }

    @Test
    public void testEnemyCreation() {
        Enemy enemy = new Enemy(15, 3, 75);
        assertEquals(15, enemy.position);
        assertEquals(3, enemy.size);
        assertEquals(75, enemy.health);
    }
}

// ScoreManagerTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

