public class Player {
    private String name;
    private int positionX;
    private int positionY;
    private int health;

    public Player(String name, int positionX, int positionY, int health) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.health = health;
    }
    
    public String getName() {
        return name;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getHealth() {
        return health;
    }

    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                positionY -= 1;
                break;
            case "down":
                positionY += 1;
                break;
            case "left":
                positionX -= 1;
                break;
            case "right":
                positionX += 1;
                break;
        }
    }

    public void interactWithEnemy(Enemy enemy, Score score) {
        if (isCollidingWith(enemy)) {
            health -= enemy.getDamage();
            if (enemy.takeDamage(10)) {
                score.addPoints(100);
            }
        }
    }

    private boolean isCollidingWith(Enemy enemy) {
        return this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY();
    }

    public static Player loadFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        if (line != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int posX = Integer.parseInt(parts[1]);
            int posY = Integer.parseInt(parts[2]);
            int health = Integer.parseInt(parts[3]);
            reader.close();
            return new Player(name, posX, posY, health);
        }
        reader.close();
        throw new IOException("Invalid player data");
    }
}