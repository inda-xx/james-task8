package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreManagerTest {

    @Test
    public void testAddPoints() {
        ScoreManager scoreManager = new ScoreManager();
        scoreManager.addPoints(10);
        assertEquals(10, scoreManager.getScore());
    }
    
    @Test
    public void testInitialScoreIsZero() {
        ScoreManager scoreManager = new ScoreManager();
        assertEquals(0, scoreManager.getScore());
    }
}

// LevelLoaderTest.java
import org.junit.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

