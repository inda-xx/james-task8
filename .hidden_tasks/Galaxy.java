import java.util.List;
import java.util.ArrayList;

public class Galaxy {
    private List<Spacecraft> spacecrafts;

    public Galaxy() {
        this.spacecrafts = new ArrayList<>();
    }

    public void addSpacecraft(Spacecraft spacecraft) {
        spacecrafts.add(spacecraft);
    }

    public void removeSpacecraft(Spacecraft spacecraft) {
        spacecrafts.remove(spacecraft);
    }

    public List<Spacecraft> getAllSpacecrafts() {
        return spacecrafts;
    }

    /**
     * Populates the galaxy with spacecraft data from a CSV file.
     * 
     * @param filename the name of the file containing spacecraft data.
     */
    public void populateFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int speed = Integer.parseInt(data[1]);
                int fuelLevel = Integer.parseInt(data[2]);
                String destination = data[3];
                addSpacecraft(new Spacecraft(name, speed, fuelLevel, destination));
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}