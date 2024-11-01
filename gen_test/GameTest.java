package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    GameState gameState;

    @Before
    public void setUp() throws IOException {
        System.setOut(new PrintStream(output));
        BufferedWriter writer = new BufferedWriter(new FileWriter("rooms.txt"));
        writer.write("Room;start;Start Room");
        writer.close();
        Game.main(new String[0]);
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testGenerateRoomsFromFile() {
        assertTrue(output.toString().contains("Start Room"));
    }

    @Test
    public void testPrintWelcomeMessage() {
        assertTrue(output.toString().contains("Welcome to The Colossal KTH Adventure"));
    }

    @Test
    public void testInvalidFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("rooms.txt"));
        writer.write("Invalid data");
        writer.close();
        try {
            Game.main(new String[0]);
        } catch (Exception e) {
            assertTrue(output.toString().contains("Error generating rooms from file"));
        }
    }
}

