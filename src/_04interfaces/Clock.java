package _04interfaces;

public class Clock {

    private int hours;
    private int minutes;
    private String time;

    public Clock() {
        time = java.time.LocalTime.now().toString();
        hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getTime() {
        return time;
    }
}
