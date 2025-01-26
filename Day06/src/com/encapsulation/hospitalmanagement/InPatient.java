package com.encapsulation.hospitalmanagement;

// Subclass 'InPatient' inherits 'Patient' class
public class InPatient extends Patient implements MedicalRecord {
    private final double ratePerDay = 700;
    private int daysAdmitted;

    public InPatient(String patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * ratePerDay;
    }

    @Override
    public void addRecord(String record) {
        System.out.println("Added record: " + record);
    }

    @Override
    public String viewRecords() {
        return "Viewing medical records...";
    }
}
