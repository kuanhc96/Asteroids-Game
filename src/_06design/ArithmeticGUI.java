package _06design;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ArithmeticGUI extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final int TEXT_AREA_WIDTH = 35;
    private static final int TEXT_AREA_ROWS = 10;
    private static final int TESTS_TO_PASS = 5;

    private JLabel titleLabel;
    private JLabel levelLabel;
    private JLabel questionLabel;
    private JTextArea answerHistoryTextArea;
    private JTextField answerTextField;
    private JButton submissionButton;
    private JLabel questionsLeftLabel;
    private Random r;
    private int level;
    private int questionsCorrect;
    private int firstNumber;
    private int secondNumber;

    public ArithmeticGUI() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Arithmetic Tester");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        r = new Random();
        level = 1;
        questionsCorrect = 0;
        createComponents();
        setVisible(true);

    }

    private void createComponents() {
        // Panel 1
        titleLabel = new JLabel("Arithmetic Tester");
        levelLabel = new JLabel("Level: " + level);
        questionLabel = new JLabel();
        // Panel 2
        answerTextField = new JTextField("Ans", 3);
        submissionButton = createButton("Submit");
        // Panel 3
        answerHistoryTextArea = new JTextArea(TEXT_AREA_ROWS, TEXT_AREA_WIDTH);
        // Panel 4
        questionsLeftLabel = new JLabel();

        createPanel();
        reset();
    }

    private void createPanel() {
        // put all subpanels into main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // panel 1
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(titleLabel);
        panel1.add(levelLabel);
        panel1.add(questionLabel);

        // panel 2
        JPanel panel2 = new JPanel();
        panel2.add(answerTextField);
        panel2.add(submissionButton);

        // pnael 2.2
        JPanel panel22 = new JPanel();
        panel22.setLayout(new BoxLayout(panel22, BoxLayout.Y_AXIS));
        JLabel rules1 = new JLabel("3 levels in total, each level has 5 questions. ");
        JLabel rules2 = new JLabel("Must answer all 5 questions correctly and ");
        JLabel rules3 = new JLabel("consecutively in order to advance to next level.");
        panel22.add(rules1);
        panel22.add(rules2);
        panel22.add(rules3);

        // panel 3
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        JScrollPane answerHistoryScrollPane = new JScrollPane(answerHistoryTextArea);
        panel3.add(answerHistoryScrollPane);

        // panel 4
        JPanel panel4 = new JPanel();
        panel4.add(questionsLeftLabel);

        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel22);
        mainPanel.add(panel3);
        mainPanel.add(panel4);
        add(mainPanel);
    }

    private JButton createButton(String buttonLabel) {
        JButton button = new JButton(buttonLabel);
        ActionListener listener = new SubmissionListener();
        button.addActionListener(listener);
        return button;
    }

    private void reset() {
        levelLabel.setText("Level: " + level);
        questionsLeftLabel.setText((TESTS_TO_PASS - questionsCorrect) + " questions left in level " + level);
        answerTextField.setText("");
        int temp1 = firstNumber;
        int temp2 = secondNumber;
        if (level == 1) {
            firstNumber = r.nextInt(5);
            secondNumber = r.nextInt(4);
            if (firstNumber == temp1 && secondNumber == temp2) {
                firstNumber = r.nextInt(5);
                secondNumber = r.nextInt(4);
            }
            questionLabel.setText("Question #" + (questionsCorrect + 1) + ": " + firstNumber + " + " + secondNumber + " = ?");
        } else {
            firstNumber = r.nextInt(5) + 4;
            secondNumber = r.nextInt(5) + 4;
            if (firstNumber == temp1 && secondNumber == temp2) {
                firstNumber = r.nextInt(5) + 4;
                secondNumber = r.nextInt(4) + 4;
            }
            if (secondNumber > firstNumber) {
                int temp = firstNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }

            if (level == 3) {
                questionLabel.setText("Question #" + (questionsCorrect + 1) + ": " + firstNumber + " - " + secondNumber + " = ?");
            } else { // level == 2
                questionLabel.setText("Question #" + (questionsCorrect + 1) + ": " + firstNumber + " + " + secondNumber + " = ?");
            }
        }
    }

    class SubmissionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {

            int answer;
            if (level == 3) {
                answer = firstNumber - secondNumber;
            }  else {
                answer = firstNumber + secondNumber;
            }
            String userInput = answerTextField.getText();
            checkAnswer(userInput, answer);
        }

        private void checkAnswer(String userInput, int answer)  {
            int userAnswer;
            if (tryParseInt(userInput)) {
                userAnswer = Integer.parseInt(userInput);
                if (userAnswer == answer) {
                    questionsCorrect++;
                    if (level == 3) {
                        answerHistoryTextArea.append("Level " + level + ", Question " + (questionsCorrect) +
                                " correct! Answer to " + firstNumber + " - " + secondNumber + " was " + answer + "\n");
                    } else {
                        answerHistoryTextArea.append("Level " + level + ", Question " + (questionsCorrect) +
                                " correct! Answer to " + firstNumber + " + " + secondNumber + " was " + answer + "\n");
                    }
                    if ((TESTS_TO_PASS - questionsCorrect) == 0) {
                        if (level != 3) {
                            answerHistoryTextArea.append("\t" + " Passed all tests in level " + level + ". Advancing to next level\n");
                        } else {
                            answerHistoryTextArea.append("\tpassed all tests in all three levels!\n");
                        }
                    } else {
                        answerHistoryTextArea.append("\t" + (TESTS_TO_PASS - questionsCorrect) + " left to answer correctly to advance to next level\n");
                    }
                    if (questionsCorrect == TESTS_TO_PASS) {
                        if (level == 3) {
                            answerHistoryTextArea.append("You passed all 3 levels and the " + TESTS_TO_PASS + " questions in each of them!");
                        } else {
                            level++;
                            questionsCorrect = 0;
                        }

                    }

                } else {
                    if (level == 3) {
                        answerHistoryTextArea.append("Level " + level + ", Question " + (questionsCorrect + 1) + " Incorrect. " +
                                "Answer to " + firstNumber + " - " + secondNumber + " was " + answer + "\n");
                    } else {
                        answerHistoryTextArea.append("Level " + level + ", Question " + (questionsCorrect + 1) + " Incorrect. " +
                                "Answer to " + firstNumber + " + " + secondNumber + " was " + answer + "\n");
                    }
                    questionsCorrect = 0;
                    answerHistoryTextArea.append("\t" + (TESTS_TO_PASS - questionsCorrect) + " left to answer correctly to advance to next level\n");

                }


                reset();



            } else {
                answerHistoryTextArea.append("Please enter a value. No alphabetic letters.");
            }
        }

        private boolean tryParseInt(String value) {
            try {
                Integer.parseInt(value);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }



}
