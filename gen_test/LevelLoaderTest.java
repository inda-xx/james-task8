package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LevelLoaderTest {

    @Test
    public void testLoadLevelsFromValidFile() throws IOException {
        String content = "1,5,10\n2,10,20\n";
        Path tempFile = Files.createTempFile("levels", ".csv");
        Files.write(tempFile, content.getBytes(), StandardOpenOption.WRITE);
        
        LevelLoader levelLoader = new LevelLoader(tempFile.toString());
        List<Level> levels = levelLoader.getLevels();
        assertEquals(2, levels.size());
        
        Level level1 = levels.get(0);
        assertEquals(1, level1.getLevelId());
        assertEquals(5, level1.getEnemyCount());
        assertEquals(10, level1.getPlayerStartPosition());
        
        Level level2 = levels.get(1);
        assertEquals(2, level2.getLevelId());
        assertEquals(10, level2.getEnemyCount());
        assertEquals(20, level2.getPlayerStartPosition());

        Files.delete(tempFile);
    }

    @Test
    public void testLoadLevelsFromEmptyFile() throws IOException {
        Path tempFile = Files.createTempFile("empty_levels", ".csv");
        LevelLoader levelLoader = new LevelLoader(tempFile.toString());
        List<Level> levels = levelLoader.getLevels();
        assertTrue(levels.isEmpty());
        Files.delete(tempFile);
    }
    
    @Test
    public void testLoadLevelsWithMalformedData() throws IOException {
        String content = "1,five,10\nthree,10,20\n";
        Path tempFile = Files.createTempFile("malformed_levels", ".csv");
        Files.write(tempFile, content.getBytes(), StandardOpenOption.WRITE);
        
        LevelLoader levelLoader = new LevelLoader(tempFile.toString());
        List<Level> levels = levelLoader.getLevels();
        assertTrue(levels.isEmpty()); // Assuming malformed data results in no levels loaded
        
        Files.delete(tempFile);
    }
}

// PowerUpTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

