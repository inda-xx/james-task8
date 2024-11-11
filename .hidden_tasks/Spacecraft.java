public class Spacecraft {
    private String name;
    private int speed;
    private int fuelLevel;
    private String destination;

    public Spacecraft(String name, int speed, int fuelLevel, String destination) {
        this.name = name;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public String getDestination() {
        return destination;
    }

    /**
     * Loads spacecraft data from a CSV file and initializes spacecraft objects.
     * 
     * @param filename the name of the file containing spacecraft data.
     */
    public static Spacecraft loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            line = reader.readLine(); // Skip header line
            if ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int speed = Integer.parseInt(data[1]);
                int fuelLevel = Integer.parseInt(data[2]);
                String destination = data[3];
                return new Spacecraft(name, speed, fuelLevel, destination);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return null;
    }
}