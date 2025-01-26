package com.encapsulation.fooddeliverysystem;

// Subclass 'VegItem' inherits 'FoodItem' class
public class VegItem extends FoodItem implements Discountable {
    private final double discount = 0.1; // 10% discount

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount : " + (discount * 100) + "%";
    }
}
