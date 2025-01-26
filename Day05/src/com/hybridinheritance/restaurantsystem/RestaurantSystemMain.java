package com.hybridinheritance.restaurantsystem;


// Main class
public class RestaurantSystemMain {
    public static void main(String[] args) {
        // Creating an object of Chef and displaying details
        Chef chef = new Chef("Abhinav", 161, "Italian");
        chef.displayDetails();
        chef.performDuties();

        System.out.println(); // break line

        // Creating an object of Waiter and displaying details
        Waiter waiter = new Waiter("Shivjot", 114, 4);
        waiter.displayDetails();
        waiter.performDuties();
    }
}