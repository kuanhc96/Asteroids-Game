package _03objects;

public class P8_19 {
    public static void main(String[] args) {
        Cannonball cannon = new Cannonball(40);
        System.out.println("Initial Position: (" + cannon.getX() + ", " + cannon.getY() + ")");
        cannon.shoot(90, 10);
        System.out.println("Final Position: (" + cannon.getX() + ", " + cannon.getY() + ")");
    }
}
