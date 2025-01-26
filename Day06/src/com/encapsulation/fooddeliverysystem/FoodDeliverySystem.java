package com.encapsulation.fooddeliverysystem;

// Main class
public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Khulche", 160, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Briyani", 280, 1);

        System.out.println(vegItem.getItemDetails() + " -> Total Price: " + vegItem.calculateTotalPrice());
        System.out.println(nonVegItem.getItemDetails() + " -> Total Price: " + nonVegItem.calculateTotalPrice());
    }
}
