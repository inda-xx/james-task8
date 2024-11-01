package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 50);
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals("Goblin", enemy.getName());
        assertEquals(50, enemy.getHealth());
    }

    @Test
    public void testEnemyHealth() {
        // Direct test case example
        assertTrue(enemy.getHealth() > 0);

        // Test a decrement in some Enemy specific behavior (not present in the current code)
        enemy = new Enemy("Orc", 100);
        assertNotEquals(0, enemy.getHealth());
    }
}