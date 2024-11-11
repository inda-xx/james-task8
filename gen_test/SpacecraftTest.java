package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpacecraftTest {

    @Test
    public void testSpacecraftInitialization() {
        Spacecraft spacecraft = new Spacecraft("Falcon", 2500, 75, "Mars");
        
        assertEquals("Falcon", spacecraft.getName());
        assertEquals(2500, spacecraft.getSpeed());
        assertEquals(75, spacecraft.getFuelLevel());
        assertEquals("Mars", spacecraft.getDestination());
    }
    
    @Test
    public void testLoadFromFile() throws IOException {
        File tempFile = File.createTempFile("spacecraft_single", ".csv");
        tempFile.deleteOnExit();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Name,Speed,FuelLevel,Destination\n");
            writer.write("Enterprise,9000,200,Saturn\n");
        }

        Spacecraft spacecraft = Spacecraft.loadFromFile(tempFile.getAbsolutePath());
        
        assertNotNull(spacecraft);
        assertEquals("Enterprise", spacecraft.getName());
        assertEquals(9000, spacecraft.getSpeed());
        assertEquals(200, spacecraft.getFuelLevel());
        assertEquals("Saturn", spacecraft.getDestination());
    }

    @Test
    public void testLoadFromFileWithNoData() throws IOException {
        File tempFile = File.createTempFile("spacecraft_empty", ".csv");
        tempFile.deleteOnExit();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Name,Speed,FuelLevel,Destination\n");
        }

        Spacecraft spacecraft = Spacecraft.loadFromFile(tempFile.getAbsolutePath());
        
        assertNull(spacecraft);
    }
}