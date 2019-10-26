package _03objects;

public class ComboLock {
    private char[] ORDER = new char[]{'R', 'L', 'R'};

    private int first;
    private int second;
    private int third;
    private int[] answer;
    private int[] current;
    private char[] currentOrder;
    private int moves;
    private int dial;

    public ComboLock(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
        answer = new int[]{first, second, third};
        current = new int[3];
        currentOrder = new char[3];
        moves = 0;
        dial = 0;
    }

    public void reset() {
        current = new int[3];
        currentOrder = new char[3];
    }

    public void turnLeft(int ticks) {
        dial = (dial + ticks) % 40;
        current[moves] = dial;
        currentOrder[moves] = 'L';
        moves++;
    }

    public void turnRight(int ticks) {
        dial = (40 + (dial - ticks) % 40) % 40;
        current[moves] = dial;
        currentOrder[moves] = 'R';
        moves++;
    }

    public boolean open() {
        for (int i = 0; i < 3; i++) {
            if (currentOrder[i] != ORDER[i] || current[i] != answer[i]) {
                reset();
                return false;
            }
        }

        reset();
        return true;
    }

    public String getCurrent() {
        String toString = "[";
        toString += current[0];
        for (int i = 1; i < current.length; i++) {
            toString += ", " + current[i];
        }
        return toString + "]";
    }

    public String getCurrentOrder() {
        String toString = "[";
        toString += currentOrder[0];
        for (int i = 1; i < currentOrder.length; i++) {
            toString += ", " + currentOrder[i];
        }
        return toString + "]";
    }

    public int getDial() {
        return dial;
    }

}
