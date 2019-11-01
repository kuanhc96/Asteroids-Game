package _04interfaces;

public class SodaCan implements Measurable {

    private double height;
    private double radius;
    private double surfaceArea;
    private double volume;

    public SodaCan(double height, double radius) {
        this.radius = radius;
        this.height = height;
        this.surfaceArea = height * 2 * radius * Math.PI + radius * radius * Math.PI;
        this.volume = radius * radius * Math.PI * height;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public double getMeasure() {
        return surfaceArea;
    }

}
