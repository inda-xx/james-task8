package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreboardTest {

    private Scoreboard scoreboard;

    @Before
    public void setUp() {
        scoreboard = new Scoreboard();
    }

    @Test
    public void testInitialScoreIsZero() {
        assertEquals(0, scoreboard.getScore());
    }

    @Test
    public void testUpdateScoreIncrementsCorrectly() {
        scoreboard.updateScore(10);
        assertEquals(10, scoreboard.getScore());

        scoreboard.updateScore(15);
        assertEquals(25, scoreboard.getScore());
    }
}