package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {
    Enemy enemy;
    
    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 30, 10, 50);
    }

    @Test
    public void testIsAlive() {
        assertTrue(enemy.isAlive());
        enemy.defeat();
        assertFalse(enemy.isAlive());
    }

    @Test
    public void testGetDamage() {
        assertEquals(10, enemy.getDamage());
    }

    @Test
    public void testGetPoints() {
        assertEquals(50, enemy.getPoints());
    }
}

