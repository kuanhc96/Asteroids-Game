package _04interfaces;

public class E9_8 { // bank account
    public static void main(String[] args) {
        BankAccount ba = new BasicAccount();
        ba.deposit(1000);
        System.out.println(ba.getBalance());
        ba.withdraw(800);
        System.out.println(ba.getBalance());
        ba.withdraw(300);
        System.out.println(ba.getBalance());
    }
}
