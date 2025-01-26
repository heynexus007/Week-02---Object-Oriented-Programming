package com.hybridinheritance.restaurantsystem;

// Superclass 'Person'
public class Person {
    //attributes for all persons
    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display information
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }
}

