package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CSVParserTest {
    
    @Test
    public void testParseCSVWithValidFile() throws IOException {
        String content = "Name,Age,Location\nJohn,25,USA\nDoe,30,UK\n";
        Path tempFile = Files.createTempFile("test", ".csv");
        Files.write(tempFile, content.getBytes(), StandardOpenOption.WRITE);
        
        List<String[]> result = CSVParser.parseCSV(tempFile.toString());
        assertArrayEquals(new String[]{"Name", "Age", "Location"}, result.get(0));
        assertArrayEquals(new String[]{"John", "25", "USA"}, result.get(1));
        assertArrayEquals(new String[]{"Doe", "30", "UK"}, result.get(2));
        
        Files.delete(tempFile);
    }
    
    @Test
    public void testParseCSVWithEmptyFile() throws IOException {
        Path tempFile = Files.createTempFile("empty", ".csv");
        List<String[]> result = CSVParser.parseCSV(tempFile.toString());
        assertTrue(result.isEmpty());
        Files.delete(tempFile);
    }
    
    @Test
    public void testParseCSVWithNonExistentFile() {
        List<String[]> result = CSVParser.parseCSV("nonexistent.csv");
        assertTrue(result.isEmpty()); // Assuming the method handles non-existent files by returning an empty list
    }
    
    @Test
    public void testParseCSVWithMalformedData() throws IOException {
        String content = "Name;Age;Location\nJohn;25\nDoe;30;UK\n";
        Path tempFile = Files.createTempFile("malformed", ".csv");
        Files.write(tempFile, content.getBytes(), StandardOpenOption.WRITE);
        
        List<String[]> result = CSVParser.parseCSV(tempFile.toString());
        assertArrayEquals(new String[]{"Name;Age;Location"}, result.get(0));
        assertArrayEquals(new String[]{"John;25"}, result.get(1));
        assertArrayEquals(new String[]{"Doe;30;UK"}, result.get(2));
        
        Files.delete(tempFile);
    }
}

// CharacterActionsTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

