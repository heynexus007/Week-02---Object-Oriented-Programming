package com.hierarchicalinheritance.schoolsystem;

// Subclass 'Student' extending 'Person'
public class Student extends Person {
    String grade;

    // Constructor for Student
    public Student(String name, int age, String grade) {
        super(name, age); // Calling the constructor of superclass
        this.grade = grade;
    }

    // Method to displaying the role of Student
    public void displayRole() {
        System.out.println(name + " is a Student");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade : " + grade);
    }
}
