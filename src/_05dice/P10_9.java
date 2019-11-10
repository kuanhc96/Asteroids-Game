package _05dice;
import java.awt.*;
import javax.swing.*;

public class P10_9 {
    public static final int FLAG_LENGTH = 500;
    public static final int FLAG_WIDTH = 300;
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setSize(FLAG_LENGTH, FLAG_WIDTH * 2);
        jframe.setTitle("P10_9: Flag Graphics");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent germanFlag = new GermanFlagGraph(0, 0, FLAG_LENGTH, FLAG_WIDTH);
        jframe.add(germanFlag);
        jframe.setVisible(true);
        JComponent separatingLine = new RectangleGraph(0, FLAG_WIDTH, FLAG_LENGTH, 5, Color.BLACK);
        jframe.add(separatingLine);
        jframe.setVisible(true);
        JComponent hungarianFlag = new HungarianFlagGraph(0, FLAG_WIDTH, FLAG_LENGTH, FLAG_WIDTH);
        jframe.add(hungarianFlag);
        jframe.setVisible(true);

    }

}
