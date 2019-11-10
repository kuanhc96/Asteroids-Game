package _05dice;
import javax.swing.*;
import java.awt.*;
public class RectangleGraph extends JComponent {
    private int x;
    private int y;
    private int width;
    private int height;
    Color color;

    public RectangleGraph(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

}
