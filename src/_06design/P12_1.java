package _06design;

import java.sql.SQLOutput;
import java.util.*;

public class P12_1 {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        startVendingMachine(vm);
    }

    private static void startVendingMachine(VendingMachine vm) {
        Scanner s = new Scanner(System.in);
        boolean vendingMachineLoop = true;
        while (vendingMachineLoop) {
            System.out.print("Welcome to this crappy vending machine that only sells overpriced items. Would you like to view your options? (y/n) ");
            boolean viewOptions = true;
            while (viewOptions) {
                char viewOptionsYN = s.nextLine().toLowerCase().charAt(0);
                System.out.println();
                if (viewOptionsYN == 'y') {
                    vm.getInfo();
                    viewOptions = false;
                } else if (viewOptionsYN == 'n') {
                    viewOptions = false;
                } else {
                    System.out.println("Please answer either (y)es or (n)o ");
                }
            }
            System.out.print("Insert Money: $");
            boolean valueMakesSense = false;
            while (!valueMakesSense) {
                try {
                    double userMoney = s.nextDouble();
                    s.nextLine(); // shift scanner pointer down one line
                    vm.setInsertedMoney(userMoney);
                    valueMakesSense = true;
                } catch (InputMismatchException e) {
                    System.out.println("Please input money, not letters: $");
                }
            }
            System.out.println();
            boolean noSuchItem = true;
            boolean insufficientFunds = true;
            String userItem;
            while (noSuchItem || insufficientFunds) {
                System.out.print("Please make a selection: ");
                userItem = s.nextLine();
                System.out.println();
                if (vm.findItem(userItem)) { // found user item
                    noSuchItem = false;
                    insufficientFunds = !vm.dispense(userItem);
                    if (insufficientFunds) {
                        System.out.print("Add Money? (y/n) ");
                        char addMoneyYN = s.next().toLowerCase().charAt(0);
                        System.out.println();
                        if (addMoneyYN == 'y') {
                            System.out.print("Insert Money: $");
                            boolean valueMakesSense2 = false;
                            while (!valueMakesSense2) {
                                try {
                                    double userMoney = s.nextDouble();
                                    s.nextLine(); // shift scanner pointer down one line
                                    vm.setInsertedMoney(userMoney + vm.getInsertedMoney());
                                    valueMakesSense2 = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Please input money, not letters: $");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("This item is not in stock. Please choose again. ");
                }
            }

            System.out.print("Would you like to make another purchase? (y/n) ");
            boolean anotherPurchase = true;
            while (anotherPurchase) {
                char anotherPurchaseYN = s.nextLine().toLowerCase().charAt(0);
                System.out.println();
                if (anotherPurchaseYN == 'y') {
                    anotherPurchase = false;
                } else if (anotherPurchaseYN == 'n') {
                    anotherPurchase = false;
                    vendingMachineLoop = false;
                } else {
                    System.out.println("Please answer either (y)es or (n)o ");
                }
            }

        }
    }
}
