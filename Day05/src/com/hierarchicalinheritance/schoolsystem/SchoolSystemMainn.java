package com.hierarchicalinheritance.schoolsystem;

// Main class
public class SchoolSystemMainn {
    public static void main(String[] args) {
        // Creating an object of 'Teacher'
        Teacher teacher = new Teacher("John", 19, "Mathematics");
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println(); // break

        // Creating an object of 'Student'
        Student student = new Student("Rahul", 16, "9th Grade");
        student.displayDetails();
        student.displayRole();

        System.out.println(); // break

        // Creating an object of 'Staff'
        Staff staff = new Staff("Piyush", 24, "Administration");
        staff.displayDetails();
        staff.displayRole();
    }
}
