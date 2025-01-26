package com.hybridinheritance.restaurantsystem;

// Subclass 'Chef' extending 'Person' and implementing 'Worker'
public class Chef extends Person implements Worker {
    String type;

    // Constructor for Chef
    public Chef(String name, int id, String type) {
        super(name, id); // Calling superclass constructor
        this.type = type;
    }

    // Implementation of performDuties from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing 'Italian' dishes");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Cooking Specialty : " + type);
    }
}