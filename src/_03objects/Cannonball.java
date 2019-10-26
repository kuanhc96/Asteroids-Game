package _03objects;

public class Cannonball {

    private double G = -9.8;

    private double xDisplacement;
    private double yDisplacement;
    private double xVelocity;
    private double yVelocity;

    public Cannonball(double xDisplacement, double yDisplacement) {
        this.xDisplacement = xDisplacement;
        this.yDisplacement = yDisplacement;
    }

    public Cannonball(double xDisplacement) {
        this(xDisplacement, 0);
    }

    public void move(double sec) {
        xDisplacement = xDisplacement + xVelocity * sec;
        yDisplacement = yDisplacement + yVelocity * sec;
        yVelocity = yVelocity + G * sec;
    }

    public double getX() {
        return xDisplacement;
    }

    public double getY() {
        return yDisplacement;
    }

    public void shoot(double angle, double velocity) {
        angle = angle / 180 * Math.PI;
        xVelocity = velocity * Math.cos(angle);
        yVelocity = velocity * Math.sin(angle);
        do {
            move(0.1);
        } while (yDisplacement > 0);
        //yDisplacement = 0;
    }
}
