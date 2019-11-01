package _04interfaces;

public class Daily extends Appointment {
    public Daily(String description, int year, int month, int day) {
        super(description, year, month, day);
    }

    @Override
    public boolean occursOn(int year, int month, int day) {
        return year >= getYear() && month >= getMonth() && day >= getDay();
    }
}
