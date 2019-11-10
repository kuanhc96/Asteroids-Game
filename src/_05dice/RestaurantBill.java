package _05dice;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaurantBill extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 1200;
    private static final int TEXT_AREA_WIDTH = 35;
    private static final int TEXT_AREA_ROWS = 20;

    private Map<JButton, Double> itemsPrices;
    private Map<JButton, Double> taxTaxRates;

    private JLabel itemsLabel;
    private JLabel pricesLabel;
    private JTextArea orders;
    private double subtotal;
    private JLabel subtotalPriceLabel;
    private JLabel totalPriceLabel;
    private double tax;

    public RestaurantBill() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        subtotal = 0;
        tax = 0;
        createComponents();
    }

    public void createComponents() {
        itemsLabel = new JLabel("Items:");
        pricesLabel = new JLabel("Prices:");
        itemsPrices = new LinkedHashMap<JButton, Double>();
        taxTaxRates = new LinkedHashMap<JButton, Double>();
        itemsPrices.put(createButton("Pancetta Carbonara"), 14.99);
        itemsPrices.put(createButton("Juicy Burger"), 9.99);
        itemsPrices.put(createButton("French Fries"), 2.50);
        itemsPrices.put(createButton("Fried Rice"), 8.50);
        itemsPrices.put(createButton("Roasted Brussel Sprouts"), 5.0);
        itemsPrices.put(createButton("Asparagus"), 5.0);
        itemsPrices.put(createButton("Rib Eye Steak"), 21.50);
        itemsPrices.put(createButton("Stinky Tofu"), 6.5);
        itemsPrices.put(createButton("Braised Pork Shoulder"), 12.5);
        itemsPrices.put(createButton("Sparkling Water"), 1.0);

        taxTaxRates.put(createTaxButton("No Tip"), 0.0);
        taxTaxRates.put(createTaxButton("15% Tip"), 0.15);
        taxTaxRates.put(createTaxButton("18% Tip"), 0.18);
        taxTaxRates.put(createTaxButton("20% Tip"), 0.2);

        subtotalPriceLabel = new JLabel("Subtotal: $" + 0);
        totalPriceLabel = new JLabel("Total: $");

        createPanel();
    }

    private void createPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 2, FRAME_WIDTH / 3, 2));
        panel.add(itemsLabel);
        panel.add(pricesLabel);
        for (JButton button : itemsPrices.keySet()) {
            panel.add(button);
            panel.add(new JLabel("$" + itemsPrices.get(button)));

        }


        JPanel panelTextArea = new JPanel();
        orders = new JTextArea(TEXT_AREA_ROWS, TEXT_AREA_WIDTH);
        panelTextArea.add(orders);

        JPanel panelTaxButtons = new JPanel();
        panelTaxButtons.setLayout(new GridLayout(1, 4));
        for (JButton button : taxTaxRates.keySet()) {
            panelTaxButtons.add(button);
        }

        JPanel panelTotalPrice = new JPanel();
        panelTotalPrice.setLayout(new BoxLayout(panelTotalPrice, BoxLayout.Y_AXIS));
        panelTotalPrice.add(subtotalPriceLabel);
        panelTotalPrice.add(totalPriceLabel);


        mainPanel.add(panel);
        mainPanel.add(panelTextArea);
        mainPanel.add(panelTaxButtons);
        mainPanel.add(panelTotalPrice);
        add(mainPanel);
    }

    private JButton createButton(String buttonLabel) {
        JButton button = new JButton(buttonLabel);
        ActionListener listener = new AddOrderListener();
        button.addActionListener(listener);
        return button;
    }

    private JButton createTaxButton(String buttonLabel) {
        JButton button = new JButton(buttonLabel);
        ActionListener listener = new AddTipListener();
        button.addActionListener(listener);
        return button;
    }

    class AddOrderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            double price = itemsPrices.get((JButton) event.getSource());
            subtotal += price;
            orders.append(((JButton) event.getSource()).getText() + ": $" + price + "\n");
            subtotalPriceLabel.setText("Subtotal: $" + subtotal);

        }
    }

    class AddTipListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            double taxPrice = taxTaxRates.get((JButton) event.getSource()) * subtotal;
            totalPriceLabel.setText("Total: $" + (int) ((subtotal + taxPrice) * 100) / 100.0);

        }
    }
}
