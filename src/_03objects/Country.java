package _03objects;

public class Country {
    private String name;
    private int population;
    private int area;
    private double popDensity;

    public Country(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.popDensity = population * 1.0 / area;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public double getPopulationDensity() {
        return popDensity;
    }

    public String getName() {
        return name;
    }
}
