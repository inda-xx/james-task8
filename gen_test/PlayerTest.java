package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("player.txt"))) {
            writer.write("Tester,0,0,100");
        }
        this.player = Player.loadFromFile("player.txt");
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Tester", player.getName());
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testPlayerMovement() {
        player.move("up");
        assertEquals(-1, player.getPositionY());
        player.move("right");
        assertEquals(1, player.getPositionX());
    }

    @Test
    public void testPlayerNoMovement() {
        player.move("invalid");
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testPlayerInteractsWithEnemy() {
        Enemy enemy = new Enemy("Goblin", 0, 0, 15, 20);
        Score score = new Score();

        player.interactWithEnemy(enemy, score);
        assertEquals(80, player.getHealth());
        assertEquals(0, score.getScore());

        player.interactWithEnemy(enemy, score);
        player.interactWithEnemy(enemy, score);
        player.interactWithEnemy(enemy, score);

        assertEquals(0, enemy.getHealth());
        assertEquals(100, score.getScore());
    }
}

/* Test cases for Enemy class */

