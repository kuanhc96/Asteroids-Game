package _03objects;

public class P8_6 {
    public static void main(String[] args) {
        Car myHybrid = new Car(50); // 50 miles per gallon
        myHybrid.addGas(20); // Tank 20 gallons
        myHybrid.drive(100); // Drive 100 miles
        System.out.println(myHybrid.getGasLevel()); // Print fuel remaining
    }
}
