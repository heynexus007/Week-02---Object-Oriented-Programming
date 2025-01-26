package com.hierarchicalinheritance.schoolsystem;

// Superclass Person
public class Person {
    // attributes for all persons
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic information
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
