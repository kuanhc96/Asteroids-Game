package _04interfaces;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle() {
        super();
        setLocation(new Point());
        setSize(0, 0);
    }

    public double getPerimeter() {
        return (getHeight() + getWidth()) * 2;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }
}
