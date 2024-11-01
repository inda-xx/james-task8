public class Player {
    private String name;
    private int health;
    private int score;

    public Player(String name, int health, int score) {
        this.name = name;
        this.health = health;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public void move(String direction, GameState gameState) {
        Room newRoom = gameState.getCurrentRoom().go(direction);
        if (newRoom != null) {
            gameState.setCurrentRoom(newRoom);
            gameState.getCurrentRoom().lookAround();
        }
    }

    public void interactWithEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            health -= enemy.getDamage();
            if (health <= 0) {
                System.out.println(name + " has been defeated!");
            } else {
                score += enemy.getPoints();
                System.out.println(name + " defeated the enemy and earned " + enemy.getPoints() + " points!");
                enemy.defeat();
            }
        }
    }
}