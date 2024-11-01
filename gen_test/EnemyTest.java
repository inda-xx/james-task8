package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    @Test
    public void testEnemyInitialization() {
        Enemy enemy = new Enemy("Monster", 50, 10);
        assertEquals("Monster", enemy.getName());
        assertEquals(50, enemy.getHealth());
        assertEquals(10, enemy.getAttackPower());
    }

    @Test
    public void testEnemyTakeDamage() {
        Enemy enemy = new Enemy("Monster", 50, 10);
        enemy.takeDamage(20);
        assertEquals(30, enemy.getHealth());
    }
}

// GameDataLoaderTest.java
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

