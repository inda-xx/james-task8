public class ScoreManager {
    private int score;

    public ScoreManager() {
        this.score = 0;
    }

    public void addPoints(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}