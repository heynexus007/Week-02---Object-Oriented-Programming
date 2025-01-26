package com.hierarchicalinheritance.schoolsystem;

// Subclass 'Teacher' extending 'Person'
public class Teacher extends Person {
    String subject; // Specific attribute for Teacher

    // Constructor for Teacher
    public Teacher(String name, int age, String subject) {
        super(name, age); // Calling constructor of superclass
        this.subject = subject;
    }

    // Method to display
    public void displayRole() {
        System.out.println(name + " is a Teacher ");
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling displayInfo method of the superclass
        System.out.println("Subject : " + subject);
    }
}