package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameDataLoaderTest {

    private GameDataLoader loader;

    @Before
    public void setUp() {
        loader = new GameDataLoader();
    }

    @Test
    public void testLoadPlayers() throws IOException {
        // Create a sample data file
        String playerData = "John,100,0\nJane,150,50\n";
        File tempFile = File.createTempFile("players", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write(playerData);
        }

        List<Player> players = loader.loadPlayers(tempFile.getAbsolutePath());
        assertEquals(2, players.size());
        assertEquals("John", players.get(0).getName());
        assertEquals("Jane", players.get(1).getName());
        assertEquals(150, players.get(1).getHealth());
    }

    @Test
    public void testLoadEnemies() throws IOException {
        // Create a sample data file
        String enemyData = "Orc,100\nGoblin,50\n";
        File tempFile = File.createTempFile("enemies", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write(enemyData);
        }

        List<Enemy> enemies = loader.loadEnemies(tempFile.getAbsolutePath());
        assertEquals(2, enemies.size());
        assertEquals("Orc", enemies.get(0).getName());
        assertEquals(50, enemies.get(1).getHealth());
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidPlayerData() throws IOException {
        String invalidPlayerData = "John,not_a_number,0\n";  // Malformed input
        File tempFile = File.createTempFile("invalid_players", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write(invalidPlayerData);
        }

        loader.loadPlayers(tempFile.getAbsolutePath());
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidEnemyData() throws IOException {
        String invalidEnemyData = "Orc,not_a_number\n";  // Malformed input
        File tempFile = File.createTempFile("invalid_enemies", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write(invalidEnemyData);
        }

        loader.loadEnemies(tempFile.getAbsolutePath());
    }

    // Additional tests with empty files and non-existing files could be added.
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

