package _05dice;
import java.awt.*;
import javax.swing.*;

public class P10_10 {
    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 300;
    public static final int DIAMETER = 100;

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        jframe.setTitle("P10_10: Olympic Rings");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent olympicRings = new OlympicRingsGraph(DIAMETER, 50, 50);
        jframe.add(olympicRings);
        jframe.setVisible(true);
    }
}
