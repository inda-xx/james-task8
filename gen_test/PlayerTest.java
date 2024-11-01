package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlayerMovements() {
        Player player = new Player();
        
        player.moveUp();
        assertEquals("(0, -1)", player.getPosition());
        
        player.moveDown();
        assertEquals("(0, 0)", player.getPosition());
        
        player.moveLeft();
        assertEquals("(-1, 0)", player.getPosition());
        
        player.moveRight();
        assertEquals("(0, 0)", player.getPosition());
    }
    
    @Test
    public void testPlayerScoreIncrease() {
        Player player = new Player();
        player.increaseScore(10);
        assertEquals(10, player.getScore());
        player.increaseScore(5);
        assertEquals(15, player.getScore());
    }
}