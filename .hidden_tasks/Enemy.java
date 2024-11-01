public class Enemy {
    private String type;
    private int positionX;
    private int positionY;
    private int strength;

    public Enemy(String type, int positionX, int positionY, int strength) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.strength = strength;
    }

    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getStrength() {
        return strength;
    }
}