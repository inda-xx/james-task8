package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GalaxyTest {

    @Test
    public void testAddSpacecraft() {
        Galaxy galaxy = new Galaxy();
        Spacecraft spacecraft = new Spacecraft("Apollo", 1000, 100, "Moon");
        
        galaxy.addSpacecraft(spacecraft);
        
        List<Spacecraft> spacecrafts = galaxy.getAllSpacecrafts();
        assertEquals(1, spacecrafts.size());
        assertEquals("Apollo", spacecrafts.get(0).getName());
    }

    @Test
    public void testRemoveSpacecraft() {
        Galaxy galaxy = new Galaxy();
        Spacecraft spacecraft = new Spacecraft("Apollo", 1000, 100, "Moon");
        
        galaxy.addSpacecraft(spacecraft);
        galaxy.removeSpacecraft(spacecraft);
        
        List<Spacecraft> spacecrafts = galaxy.getAllSpacecrafts();
        assertEquals(0, spacecrafts.size());
    }

    @Test
    public void testGetAllSpacecrafts() {
        Galaxy galaxy = new Galaxy();
        
        Spacecraft s1 = new Spacecraft("Apollo", 1000, 100, "Moon");
        Spacecraft s2 = new Spacecraft("Voyager", 50000, 50, "Interstellar");
        
        galaxy.addSpacecraft(s1);
        galaxy.addSpacecraft(s2);
        
        List<Spacecraft> spacecrafts = galaxy.getAllSpacecrafts();
        assertEquals(2, spacecrafts.size());
        assertEquals("Apollo", spacecrafts.get(0).getName());
        assertEquals("Voyager", spacecrafts.get(1).getName());
    }

    @Test
    public void testPopulateFromFile() throws IOException {
        File tempFile = File.createTempFile("spacecrafts", ".csv");
        tempFile.deleteOnExit();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Name,Speed,FuelLevel,Destination\n");
            writer.write("Apollo,1000,100,Moon\n");
            writer.write("Voyager,50000,50,Interstellar\n");
        }

        Galaxy galaxy = new Galaxy();
        galaxy.populateFromFile(tempFile.getAbsolutePath());
        
        List<Spacecraft> spacecrafts = galaxy.getAllSpacecrafts();
        assertEquals(2, spacecrafts.size());
        assertEquals("Apollo", spacecrafts.get(0).getName());
        assertEquals("Voyager", spacecrafts.get(1).getName());
    }

    @Test
    public void testPopulateFromFileWithInvalidData() throws IOException {
        File tempFile = File.createTempFile("spacecrafts_invalid", ".csv");
        tempFile.deleteOnExit();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Name,Speed,FuelLevel,Destination\n");
            writer.write("Apollo,1000,100,Moon\n");
            writer.write("Invalid\n");
        }

        Galaxy galaxy = new Galaxy();
        galaxy.populateFromFile(tempFile.getAbsolutePath());
        
        List<Spacecraft> spacecrafts = galaxy.getAllSpacecrafts();
        assertEquals(1, spacecrafts.size());
        assertEquals("Apollo", spacecrafts.get(0).getName());
    }
}

