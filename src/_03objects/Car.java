package _03objects;

public class Car {
    private double efficiency;
    private double gasLevel;

    public Car(double efficiency) {
        this.efficiency = efficiency;
        gasLevel = 0;
    }

    public void addGas(double gas) {
        gasLevel += gas;
    }

    public void drive(double miles) {
        gasLevel -= miles / efficiency;
    }

    public double getGasLevel() {
        return gasLevel;
    }

    public static class ComboLock {
    }
}
