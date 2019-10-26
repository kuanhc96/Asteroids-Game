package _03objects;

public class P8_7 {
    public static void main(String[] args) {
        ComboLock comboLock = new ComboLock(3, 13, 4);
        comboLock.turnRight(37);
        comboLock.turnLeft(10);
        comboLock.turnRight(9);
        System.out.println(comboLock.getCurrent());
        System.out.println(comboLock.open());
        System.out.println(comboLock.getCurrent());
    }
}
