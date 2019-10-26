package _03objects;
import java.util.*;

public class P8_14 {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<Country>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            Country newCountry = new Country("# " + (i + 1),
                    rand.nextInt(10000), rand.nextInt(1000000));
            countries.add(newCountry);
        }
        Country greatestPopulation = findGreatestPopulation(countries);
        Country biggestArea = findGreatestArea(countries);
        Country greatestDensity = findGreatestDensity(countries);

        System.out.println("Country " + greatestPopulation.getName() +
                " has the greatest population of " + greatestPopulation.getPopulation() +
                " people");
        System.out.println("Country " + biggestArea.getName() +
                " has the greatest area of " + biggestArea.getArea() +
                " square kilometers");
        System.out.println("Country " + greatestDensity.getName() +
                " has the greatest density of " + greatestDensity.getPopulationDensity() +
                " people per square kilometer");

    }

    public static Country findGreatestPopulation(List<Country> countries) {
        int maxPopulation = 0;
        Country mostPopulousCountry = null;
        for (Country country : countries) {
            if (country.getPopulation() > maxPopulation) {
                maxPopulation = country.getPopulation();
                mostPopulousCountry = country;
            }
        }

        return mostPopulousCountry;
    }

    public static Country findGreatestArea(List<Country> countries) {
        int maxArea = 0;
        Country biggestCountry = null;
        for (Country country : countries) {
            if (country.getArea() > maxArea) {
                maxArea = country.getArea();
                biggestCountry = country;
            }
        }

        return biggestCountry;
    }

    public static Country findGreatestDensity(List<Country> countries) {
        double maxDensity = 0;
        Country greatestDensity = null;
        for (Country country : countries) {
            if (country.getPopulationDensity() > maxDensity) {
                maxDensity = country.getPopulationDensity();
                greatestDensity = country;
            }
        }

        return greatestDensity;
    }
}
