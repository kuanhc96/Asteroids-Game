package _05dice.pig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PigFrame extends JFrame {
    private static final int GOAL_SCORE = 100;
    private static final int FRAME_WIDTH = 660;
    private static final int FRAME_HEIGHT = 800;
    private static final int TEXT_AREA_WIDTH = 35;
    private static final int TEXT_AREA_HEIGHT = 50;

    private int roundScore;
    private int totalScore;
    private JButton rollButton;
    private JButton holdButton;
    private JLabel roundScoreLabel;
    private JLabel totalScoreLabel;
    private JTextArea historyTextArea;

    class RollPigListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            Random rand = new Random();
            int roll = rand.nextInt(6) + 1;
            if (roll == 1) {
                roundScore = 0;
                historyTextArea.append("Pig Out! You Lost All Points This Round!\n");
            } else {
                roundScore += roll;
                historyTextArea.append("You Rolled a " + roll + "! Current Score Of This Round: " + roundScore +
                        ". You Will have " + (roundScore + totalScore)  + " In Total If You Hold Now. \n");
            }
            roundScoreLabel.setText("Current Score: " + roundScore);
        }
    }

    class HoldScoreListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            totalScore += roundScore;
            historyTextArea.append("Score Recorded. You Currently Have: " + totalScore + " Points\n");
            roundScore = 0;
            if (totalScore >= GOAL_SCORE) {
                historyTextArea.append("You Won!!! Your Total Score Was" + (totalScore) + "\n");
                historyTextArea.append("Game Reset\n");
                roundScore = 0;
                totalScore = 0;
            }
            roundScoreLabel.setText("Current Score: " + 0);
            totalScoreLabel.setText("Total Score: " + totalScore);
        }
    }

    public PigFrame() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        createComponents();
        createPanel();
    }

    private void createComponents() {
        roundScore = 0;
        totalScore = 0;

        rollButton = createRollButton("Roll!");
        holdButton = createHoldButton("Hold Score...");
        roundScoreLabel = new JLabel("Current Score: " + roundScore);
        totalScoreLabel = new JLabel("Total Score: " + totalScore);

    }

    private JButton createRollButton(String buttonName) {
        JButton jButton = new JButton(buttonName);
        ActionListener rollListener = new RollPigListener();
        jButton.addActionListener(rollListener);
        return jButton;
    }

    private JButton createHoldButton(String buttonName) {
        JButton jButton = new JButton(buttonName);
        ActionListener holdScoreListener = new HoldScoreListener();
        jButton.addActionListener(holdScoreListener);
        return jButton;
    }

    private void createPanel() {
        JPanel mainPanel = new JPanel(); // main panel
        mainPanel.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // stack panels on top of each other

        JPanel textAreaPanel = new JPanel();
        textAreaPanel.setSize(FRAME_WIDTH,  TEXT_AREA_HEIGHT * 10);
        historyTextArea = new JTextArea(TEXT_AREA_WIDTH, TEXT_AREA_HEIGHT);
        JScrollPane textAreaScrollPane = new JScrollPane(historyTextArea);
        textAreaPanel.add(textAreaScrollPane);

        JPanel labelButtonsPanel = new JPanel();
        labelButtonsPanel.setSize(FRAME_WIDTH, FRAME_HEIGHT - TEXT_AREA_HEIGHT * 10);
        labelButtonsPanel.setLayout(new GridLayout(2, 2));
        labelButtonsPanel.add(roundScoreLabel);
        labelButtonsPanel.add(rollButton);
        labelButtonsPanel.add(totalScoreLabel);
        labelButtonsPanel.add(holdButton);

        mainPanel.add(textAreaPanel);
        mainPanel.add(labelButtonsPanel);

        add(mainPanel);
    }



}
