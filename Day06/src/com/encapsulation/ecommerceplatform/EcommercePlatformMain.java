package com.encapsulation.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class EcommercePlatformMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Electronics electronics=new Electronics(1, "Laptop", 40000, 0.1);
        Clothing cloths=new Clothing(2, "T-Shirt", 120, 0.2);
        Groceries groceries=new Groceries(3, "Rice", 499, 0.05);

        // Adding products into the list
        products.add(electronics);  // 10% discount
        products.add(cloths);       // 20% discount
        products.add(groceries);    // 5% discount

        // Calculating and printing final prices
        Product.getFinalPrices(products);
    }
}
