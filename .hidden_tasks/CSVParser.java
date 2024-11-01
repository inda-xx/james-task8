import java.util.List;
import java.util.ArrayList;

public class CSVParser {
    public static List<String[]> parseCSV(String filename) {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split lines by comma
                String[] values = line.split(",");
                data.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}

// Exercise 2: Class Design Principles

// Explanation is generally a text-based explanation. Here we focus on implementing potential classes.

public interface CharacterActions {
    void move();
    void interact();
}