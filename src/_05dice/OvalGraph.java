package _05dice;
import java.awt.*;
import javax.swing.*;
public class OvalGraph extends JComponent {
    private int x;
    private int y;
    private int width;
    private int height;
    Color color;

    public OvalGraph(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }

    public void paintAgain(int x2, int y2, int width2, int height2, Color color2) {
        x = x2;
        y = y2;
        width = width2;
        height = height2;
        color = color2;
        repaint();
    }
}
