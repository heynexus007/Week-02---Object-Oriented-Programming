package com.encapsulation.hospitalmanagement;

// Abstract class 'Patient'
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    // Concrete method to get patientDetails
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}
