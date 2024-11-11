import java.util.Scanner;

public class SpaceSimulator {
    private Galaxy galaxy;
    private Scanner scanner;

    public SpaceSimulator() {
        galaxy = new Galaxy();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Space Simulator!");
        boolean running = true;
        while (running) {
            System.out.println("Enter command (view, launch, refuel, quit):");
            String command = scanner.nextLine();
            switch (command) {
                case "view":
                    viewSpacecrafts();
                    break;
                case "launch":
                    simulateLaunch();
                    break;
                case "refuel":
                    refuelSpacecraft();
                    break;
                case "quit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }

    private void viewSpacecrafts() {
        for (Spacecraft spacecraft : galaxy.getAllSpacecrafts()) {
            System.out.println("Name: " + spacecraft.getName() +
                               ", Speed: " + spacecraft.getSpeed() +
                               ", Fuel Level: " + spacecraft.getFuelLevel() +
                               ", Destination: " + spacecraft.getDestination());
        }
    }

    private void simulateLaunch() {
        System.out.println("Enter the name of the spacecraft to launch:");
        String name = scanner.nextLine();
        for (Spacecraft spacecraft : galaxy.getAllSpacecrafts()) {
            if (spacecraft.getName().equals(name)) {
                System.out.println("Launching " + name + " to " + spacecraft.getDestination());
                // Simulate reduction of fuelLevel by some amount here, depending on speed or distance
                break;
            }
        }
    }

    private void refuelSpacecraft() {
        System.out.println("Enter the name of the spacecraft to refuel:");
        String name = scanner.nextLine();
        for (Spacecraft spacecraft : galaxy.getAllSpacecrafts()) {
            if (spacecraft.getName().equals(name)) {
                // Simulate refueling by increasing fuelLevel
                System.out.println("Refueling " + name);
                break;
            }
        }
    }

    public static void main(String[] args) {
        SpaceSimulator simulator = new SpaceSimulator();
        simulator.galaxy.populateFromFile("spacecrafts.csv");
        simulator.start();
    }
}