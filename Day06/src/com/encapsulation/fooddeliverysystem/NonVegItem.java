package com.encapsulation.fooddeliverysystem;

// Subclass 'NonVegItem' inherits 'FoodItem' class
public class NonVegItem extends FoodItem {
    private final double extraCharge = 0.15; // 15% extra charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 + extraCharge);
    }
}
