package _04interfaces;

public class BasicAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Not enough money to be withdrawn!");
        }
    }
}
