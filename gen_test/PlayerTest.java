package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player("Hero", 100);
        assertEquals("Hero", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerTakeDamage() {
        Player player = new Player("Hero", 100);
        player.takeDamage(10);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testPlayerIncreaseScore() {
        Player player = new Player("Hero", 100);
        player.increaseScore(50);
        assertEquals(50, player.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPlayerNegativeHealth() {
        new Player("Hero", -10);
    }
}

// EnemyTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

