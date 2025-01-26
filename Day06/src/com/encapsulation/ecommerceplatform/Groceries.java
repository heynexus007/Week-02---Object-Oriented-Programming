package com.encapsulation.ecommerceplatform;

// concrete 'Groceries' class
public class Groceries extends Product {
    private double discountRate;

    //Constructor
    public Groceries(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}
