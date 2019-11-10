package _05dice;
import java.awt.*;
import javax.swing.*;

public class GermanFlagGraph extends JComponent{
    private int flagLength;
    private int flagWidth;
    private int topLeftPositionX;
    private int topLeftPositionY;

    public GermanFlagGraph(int topLeftPositionX, int topLeftPositionY, int flagLength, int flagWidth) {
        super();
        this.topLeftPositionX = topLeftPositionX;
        this.topLeftPositionY = topLeftPositionY;
        this.flagLength = flagLength;
        this.flagWidth = flagWidth;
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(topLeftPositionX, topLeftPositionY + 0 * flagWidth / 3, flagLength, flagWidth / 3);
        g.setColor(Color.RED);
        g.fillRect(topLeftPositionX, topLeftPositionY + 1 * flagWidth / 3, flagLength, flagWidth / 3);
        g.setColor(Color.YELLOW);
        g.fillRect(topLeftPositionX, topLeftPositionY + 2 * flagWidth / 3, flagLength, flagWidth / 3);

    }
}
