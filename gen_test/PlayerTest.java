package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    Player player;
    Room room1;
    Room room2;
    GameState gameState;
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        player = new Player("TestPlayer", 100, 0);
        room1 = new Room("Room 1");
        room2 = new Room("Room 2");
        room1.addExit("east", room2);
        gameState = new GameState(room1);
        System.setOut(new PrintStream(output));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testMoveValidDirection() {
        player.move("east", gameState);
        assertEquals(room2, gameState.getCurrentRoom());
    }

    @Test
    public void testMoveInvalidDirection() {
        player.move("west", gameState);
        assertEquals(room1, gameState.getCurrentRoom());
        assertTrue(output.toString().contains("You can't go that way!"));
    }

    @Test
    public void testInteractWithEnemy() {
        Enemy enemy = new Enemy("Orc", 50, 20, 100);
        player.interactWithEnemy(enemy);
        assertEquals(80, player.getHealth());
        assertEquals(100, player.getScore());
    }

    @Test
    public void testInteractWithDeadEnemy() {
        Enemy enemy = new Enemy("Orc", 0, 20, 100);
        player.interactWithEnemy(enemy);
        assertEquals(100, player.getHealth());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerDefeated() {
        Enemy strongEnemy = new Enemy("Dragon", 100, 120, 500);
        player.interactWithEnemy(strongEnemy);
        assertTrue(output.toString().contains("TestPlayer has been defeated!"));
    }
}

