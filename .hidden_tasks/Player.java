import java.util.Scanner;

public class Player {
    private int score;
    private int x, y;

    public Player() {
        this.score = 0;
        this.x = 0;
        this.y = 0;
    }

    public void moveUp() {
        y--;
        System.out.println("Moved up to (" + x + ", " + y + ")");
    }

    public void moveDown() {
        y++;
        System.out.println("Moved down to (" + x + ", " + y + ")");
    }

    public void moveLeft() {
        x--;
        System.out.println("Moved left to (" + x + ", " + y + ")");
    }

    public void moveRight() {
        x++;
        System.out.println("Moved right to (" + x + ", " + y + ")");
    }

    public void increaseScore(int points) {
        score += points;
        System.out.println("Score increased by " + points + ". Total score: " + score);
    }

    public int getScore() {
        return score;
    }

    public void startMovementLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Use `w`, `a`, `s`, `d` to move up, left, down, right.");

        while (true) {
            System.out.print("Enter movement: ");
            String command = scanner.nextLine();

            switch (command) {
                case "w":
                    moveUp();
                    break;
                case "a":
                    moveLeft();
                    break;
                case "s":
                    moveDown();
                    break;
                case "d":
                    moveRight();
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}