package com.hierarchicalinheritance.schoolsystem;

// Subclass 'Staff' extending 'Person'
public class Staff extends Person {
    String department;

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age); // Calling the constructor of superclass
        this.department = department;
    }

    // Method to display the role of Staff
    public void displayRole() {
        System.out.println(name + " is a Staff member working in the " + department + " department");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
