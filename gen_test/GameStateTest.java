package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameStateTest {
    Room room1;
    Room room2;
    GameState gameState;

    @Before
    public void setUp() {
        room1 = new Room("Room 1");
        room2 = new Room("Room 2");
        room1.addExit("east", room2);
        gameState = new GameState(room1);
    }

    @Test
    public void testGetCurrentRoom() {
        assertEquals(room1, gameState.getCurrentRoom());
    }

    @Test
    public void testSetCurrentRoom() {
        gameState.setCurrentRoom(room2);
        assertEquals(room2, gameState.getCurrentRoom());
    }
}

