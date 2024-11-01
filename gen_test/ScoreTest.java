package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreTest {
    
    private Score score;

    @Before
    public void setUp() {
        this.score = new Score();
    }

    @Test
    public void testScoreInitialization() {
        assertEquals(0, score.getScore());
    }

    @Test
    public void testAddPoints() {
        score.addPoints(150);
        assertEquals(150, score.getScore());

        score.addPoints(0);
        assertEquals(150, score.getScore());
    }
}

/* Test cases for GameLoop class. Ensure to place mock files since it requires file initialization */

