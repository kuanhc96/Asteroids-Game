package _04interfaces;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public double getPerimeter() {
        return (getHeight() + getWidth()) * 2;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }
}
