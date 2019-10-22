package _03objects;

public class Microwave {
    private int time;
    private int powerLevel;

    public Microwave() {
        time = 0;
        this.powerLevel = 1;
    }

    public int getTime() {
        return time;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void add30() {
        time += 30;
    }

    public void switchPowerLevel() {
        if (powerLevel == 1) {
            powerLevel= 2;
        } else if (powerLevel == 2) {
            powerLevel = 1;
        }
    }

    public void reset() {
        time = 0;
        powerLevel = 1;
    }

    public void start() {
        System.out.println("Cooking for" + time + "seconds at level" + powerLevel);
    }
}
