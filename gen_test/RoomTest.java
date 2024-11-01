package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {
    Room room1;
    Room room2;
    ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        room1 = new Room("Room 1");
        room2 = new Room("Room 2");
        room1.addExit("north", room2);
        System.setOut(new PrintStream(output));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testAddExitAndGo() {
        Room newRoom = room1.go("north");
        assertEquals(room2, newRoom);
    }

    @Test
    public void testGoInvalidDirection() {
        Room returnedRoom = room1.go("south");
        assertEquals(null, returnedRoom);
        assertTrue(output.toString().contains("You can't go that way!"));
    }
    
    @Test
    public void testLookAround() {
        room1.lookAround();
        assertTrue(output.toString().contains("Room 1"));
        assertTrue(output.toString().contains("north"));
    }
}

