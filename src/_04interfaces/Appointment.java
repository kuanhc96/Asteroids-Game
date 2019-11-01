package _04interfaces;

public class Appointment {
    private String description;
    private int year;
    private int month;
    private int day;

    public Appointment(String description, int year, int month, int day) {
        this.description = description;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean occursOn(int yr, int mh, int dy) {
        return this.year == yr && this.month == mh && this.day == dy;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
