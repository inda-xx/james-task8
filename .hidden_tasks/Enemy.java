public class Enemy {
    private int x, y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Moves the enemy in the game
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public int getX() { return x; }
    
    public int getY() { return y; }
}