package _05dice;

import javax.swing.*;
import java.awt.*;

public class OlympicRingsGraph extends JComponent {
    private int ringSize;
    private int topLeftPositionX;
    private int topLeftPositionY;
    public OlympicRingsGraph(int ringSize, int topLeftPositionX, int topLeftPositionY) {
        this.ringSize = ringSize;
        this.topLeftPositionX = topLeftPositionX;
        this.topLeftPositionY = topLeftPositionY;
    }

    private void setLineThickness(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
    }

    @Override
    public void paintComponent(Graphics g) {
        setLineThickness(g);
        g.setColor(Color.BLUE.brighter().brighter());
        g.drawOval(topLeftPositionX, topLeftPositionY, ringSize, ringSize);
        g.setColor(Color.BLACK);
        g.drawOval(topLeftPositionX + ringSize + ringSize / 10,
                      topLeftPositionY, ringSize, ringSize);
        g.setColor(Color.RED);
        g.drawOval(topLeftPositionX + 2 * ringSize + 2 * ringSize / 10,
                       topLeftPositionY, ringSize, ringSize);
        g.setColor(Color.YELLOW);
        g.drawOval(topLeftPositionX + ringSize / 2,
                   topLeftPositionY + ringSize / 2 + ringSize / 10, ringSize, ringSize);
        g.setColor(Color.GREEN);
        g.drawOval(topLeftPositionX + ringSize / 2 + ringSize + ringSize / 10,
                   topLeftPositionY + ringSize / 2 + ringSize / 10, ringSize, ringSize);
    }
}
