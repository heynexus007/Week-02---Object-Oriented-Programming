package com.encapsulation.fooddeliverysystem;

// Abstract class 'FoodItem'
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item : " + itemName + " -> Price : " + price + " -> Quantity : " + quantity;
    }

    // Getter and setter for getting or set Values
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
