package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    Item item;

    @Before
    public void setUp() {
        item = new Item("Sword", "A sharp blade.", true);
    }

    @Test
    public void testGetItemName() {
        assertEquals("Sword", item.getItemName());
    }

    @Test
    public void testGetItemDescription() {
        assertEquals("A sharp blade.", item.getItemDescription());
    }

    @Test
    public void testIsCollectible() {
        assertTrue(item.isCollectible());
    }
}