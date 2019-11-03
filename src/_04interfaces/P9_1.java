package _04interfaces;

public class P9_1 {
    public static void main(String[] args) {
        Clock chicagoTime = new Clock();
        Clock seattleTime = new WorldClock(-2);
        System.out.println("Chicago hour: " + chicagoTime.getHours());
        System.out.println("Local time: " + chicagoTime.getTime());
        System.out.println("Seattle hour: " + seattleTime.getHours());
        System.out.println("Seattle minutes: " + seattleTime.getMinutes());
        System.out.println("Local time: " + seattleTime.getTime());
    }
}
