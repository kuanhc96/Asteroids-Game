package _05dice;

import javax.swing.*;
import java.awt.*;

public class P10_19 {

    public static void main(String[] args) {
        restaurantBillGUI();
    }

    public static void restaurantBillGUI() {
        JFrame jframe = new RestaurantBill();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setTitle("P10_19: RESTAURANT BILL");
        jframe.setVisible(true);
    }
}
