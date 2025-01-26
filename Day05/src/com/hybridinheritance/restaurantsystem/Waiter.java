package com.hybridinheritance.restaurantsystem;

// Subclass Waiter extending Person and implementing Worker
class Waiter extends Person implements Worker {
    int assignedTab;

    // Constructor for Waiter
    public Waiter(String name, int id, int assignedTab) {
        super(name, id); // Calling superclass constructor
        this.assignedTab = assignedTab;
    }

    // Implementation of performDuties from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at table "+assignedTab);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Assigned Table : " + assignedTab);
    }
}
