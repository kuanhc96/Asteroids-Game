package _05dice;
import javax.swing.*;
import java.awt.*;
public class LineGraph extends JComponent {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Color color;

    public LineGraph(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }

}
