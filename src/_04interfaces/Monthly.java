package _04interfaces;

public class Monthly extends Appointment {
    public Monthly(String description, int year, int month, int day) {
        super(description, year, month, day);
    }

    @Override
    public boolean occursOn(int year, int month, int day) {
        return year >= getYear() && day == getDay();
    }
}
