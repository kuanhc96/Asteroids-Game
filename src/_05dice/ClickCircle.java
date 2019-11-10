package _05dice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickCircle extends JFrame {
    public static final int LENGTH = 500;
    public static final int WIDTH = 300;

    private JPanel panel;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double radius;
    private OvalGraph circle;

    class ClickCircleListener implements MouseListener {
        private boolean firstSecondClick;

        public ClickCircleListener() {
            firstSecondClick = false;
        }

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            if (!firstSecondClick) { // no clicks have been made
                x1 = e.getX();
                y1 = e.getY();
                firstSecondClick = true;
            } else {
                x2 = e.getX();
                y2 = e.getY();
                radius = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
                circle.paintAgain((int) (x1 - radius), (int) (y1 - radius),
                        (int) radius * 2, (int) radius * 2, Color.BLACK);
                firstSecondClick = false;
            }

        }

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}

    }

    public ClickCircle() {
        circle = new OvalGraph(0, 0, 0, 0, Color.BLACK);
        add(circle);
        MouseListener listener = new ClickCircleListener();
        circle.addMouseListener(listener);
        setSize(LENGTH, WIDTH);
    }




}
