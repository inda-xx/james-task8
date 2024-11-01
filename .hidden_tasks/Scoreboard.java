public class Scoreboard {
    private int score;

    public Scoreboard() {
        this.score = 0;
    }

    public void updateScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return score;
    }
}