public class Player {
    private int x, y;
    private int score;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.score = 0;
    }
    
    // Moves the player to a new position
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    // Increases the player's score
    public void increaseScore(int points) {
        this.score += points;
    }

    public int getX() { return x; }
    
    public int getY() { return y; }
    
    public int getScore() { return score; }
}