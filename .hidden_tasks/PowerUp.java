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

    // Additional logic for activating and expiring the power-up
}