package _04interfaces;

public class Instructor extends Person {
    private int salary;
    public Instructor(String name, int birthYear, int salary) {
        super(name, birthYear);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getName() + " earns " + getSalary() + " per year and was born in " + getBirthYear();
    }
}
