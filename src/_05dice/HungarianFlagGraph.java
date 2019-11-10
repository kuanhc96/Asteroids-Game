package _05dice;

import javax.swing.*;
import java.awt.*;

public class HungarianFlagGraph extends JComponent {
    private int flagLength;
    private int flagWidth;
    private int topLeftPositionX;
    private int topLeftPositionY;

    public HungarianFlagGraph(int topLeftPositionX, int topLeftPositionY, int flagLength, int flagWidth) {
        super();
        this.topLeftPositionX = topLeftPositionX;
        this.topLeftPositionY = topLeftPositionY;
        this.flagLength = flagLength;
        this.flagWidth = flagWidth;
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.RED.darker());
        g.fillRect(topLeftPositionX, topLeftPositionY + 0 * flagWidth / 3, flagLength, flagWidth / 3);
        g.setColor(Color.WHITE);
        g.fillRect(topLeftPositionX, topLeftPositionY + 1 * flagWidth / 3, flagLength, flagWidth / 3);
        g.setColor(Color.GREEN.darker().darker());
        g.fillRect(topLeftPositionX, topLeftPositionY + 2 * flagWidth / 3, flagLength, flagWidth / 3);

    }
}
