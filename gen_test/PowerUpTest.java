package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PowerUpTest {

    @Test
    public void testPowerUpCreation() {
        PowerUp powerUp = new PowerUp("Speed", 5);
        assertEquals("Speed", powerUp.getType());
        assertEquals(5, powerUp.getDuration());
    }
}