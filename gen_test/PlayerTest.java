package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 100, 0);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerMove() {
        player.move(2, 3);
        // Ideally, you would check player position, but that functionality is not exposed as per the current class design
    }

    @Test
    public void testPlayerCollide() {
        Enemy enemy = new Enemy("Orc", 80);
        player.collideWith(enemy);

        assertEquals(90, player.getHealth());
        // Check if health decreases appropriately
    }

    @Test
    public void testCollisionWithMortallyDangerousEnemy() {
        Enemy dangerousEnemy = new Enemy("Dragon", 100);
        player.collideWith(dangerousEnemy);

        assertTrue(player.getHealth() < 100);
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

