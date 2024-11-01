package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    private Enemy enemy;

    @Before
    public void setUp() {
        this.enemy = new Enemy("Goblin", 10, 10, 30, 10);
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals("Goblin", enemy.getName());
        assertEquals(10, enemy.getPositionX());
        assertEquals(10, enemy.getPositionY());
        assertEquals(30, enemy.getHealth());
        assertEquals(10, enemy.getDamage());
    }

    @Test
    public void testEnemyTakeDamage() {
        assertTrue(!enemy.takeDamage(5));
        assertEquals(25, enemy.getHealth());

        assertTrue(!enemy.takeDamage(25));
        assertEquals(0, enemy.getHealth());

        assertTrue(enemy.takeDamage(10));
        assertEquals(-10, enemy.getHealth());
    }
}

/* Test cases for Score class */

