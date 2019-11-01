package _04interfaces;

public class WorldClock extends Clock {
    private int offset;
    public WorldClock(int offset) {
        super();
        this.offset = offset;
    }

    @Override
    public int getHours() {
        if (super.getHours() + offset < 0) {
            return 24 - (super.getHours() + offset);
        } else {
            return (super.getHours() + offset);
        }

    }

    @Override
    public String getTime() {
        return getHours() + ":" + super.getMinutes();
    }

}
