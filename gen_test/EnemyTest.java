package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Zombie", 5, 5, 10);
    }

    @Test
    public void testMoveEnemyPositionUpdatesCorrectly() {
        enemy.move(2, 3);
        assertEquals(7, enemy.getPositionX());
        assertEquals(8, enemy.getPositionY());
    }

    @Test
    public void testEnemyStrengthIsCorrect() {
        assertEquals(10, enemy.getStrength());
    }

    @Test
    public void testGetEnemyPosition() {
        assertEquals(5, enemy.getPositionX());
        assertEquals(5, enemy.getPositionY());
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

