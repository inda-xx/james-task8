package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("TestPlayer", 5, 10, 10, 100);
    }

    @Test
    public void testMovePlayerPositionUpdatesCorrectly() {
        player.move(3, 4);
        assertEquals(13, player.getPositionX());
        assertEquals(14, player.getPositionY());
    }

    @Test
    public void testPlayerHealthReducesCorrectly() {
        player.takeDamage(30);
        assertEquals(70, player.getHealth());
    }

    @Test
    public void testPlayerCollidesWithEnemy() {
        Enemy enemy = new Enemy("Skeleton", 10, 10, 15);
        assertTrue(player.collide(enemy));
    }

    @Test
    public void testPlayerDoesNotCollideWithEnemy() {
        Enemy enemy = new Enemy("Skeleton", 11, 11, 15);
        assertFalse(player.collide(enemy));
    }

    @Test
    public void testLoadPlayersFromFile() {
        // Assuming a file player_data.txt with content:
        // "John,5,1,1,100\nJane,4,2,2,100\n"
        List<Player> players = Player.loadPlayersFromFile("player_data.txt");
        assertNotNull(players);
        assertEquals(2, players.size());
        assertEquals("John", players.get(0).getName());
        assertEquals(1, players.get(0).getPositionX());
        assertEquals(2, players.get(1).getPositionX());
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

