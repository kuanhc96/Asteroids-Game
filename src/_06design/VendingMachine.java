package _06design;

import java.util.*;

public class VendingMachine {
    private double insertedMoney;
    private Map<String, Double> itemPrice;
    private Map<String, Integer> itemAmount;

    public VendingMachine() {
        insertedMoney = 0;
        itemPrice = new HashMap<>();
        itemAmount = new HashMap<>();

        // items-price
        itemPrice.put("Coke", 1.0);
        itemPrice.put("Sprite", 1.0);
        itemPrice.put("Fanta", 1.0);
        itemPrice.put("AquaFina", 2.5);
        itemPrice.put("Iced Tea", 1.79);
        itemPrice.put("Jalapeno Chips", 1.5);
        itemPrice.put("Gummy Bears", 0.99);
        // items-amount
        itemAmount.put("Coke", 1);
        itemAmount.put("Sprite", 1);
        itemAmount.put("Fanta", 1);
        itemAmount.put("AquaFina", 2);
        itemAmount.put("Iced Tea", 1);
        itemAmount.put("Jalapeno Chips", 1);
        itemAmount.put("Gummy Bears", 1);
    }

    // print information about the vending machine
    public void getInfo() {
        System.out.println("Warning: This crappy machine does not give out change. ");
        System.out.println("Money in machine: " + insertedMoney);
        for (String item :
                itemPrice.keySet()) {
            System.out.println(item + ": $" + itemPrice.get(item) + ", " + itemAmount.get(item) + " left");
        }
    }

    public boolean dispense(String item) {
        if (itemPrice.get(item) > insertedMoney) {
            System.out.println("Insufficient funds.");
            return false;
        } else {
            itemAmount.put(item, itemAmount.get(item) - 1);
            insertedMoney = 0;
            System.out.println("Payment processed. Dispensing item...");
            return true;
        }
    }

    public boolean findItem(String item) {
        return itemAmount.containsKey(item) && itemAmount.get(item) != 0;
    }

    public void setInsertedMoney(double money) {
        insertedMoney = money;
    }

    public double getInsertedMoney() {
        return insertedMoney;
    }
}
