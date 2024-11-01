public class PowerUp {
    private String type;
    private int duration;

    public PowerUp(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public void applyEffect(Player player) {
        // Implement power-up logic here, e.g., increase health or speed
    }
}