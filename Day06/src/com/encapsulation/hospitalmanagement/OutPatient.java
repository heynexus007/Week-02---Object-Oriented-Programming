package com.encapsulation.hospitalmanagement;

// Subclass 'OutPatient' inherits 'Patient' class
public class OutPatient extends Patient {
    private static final double ConsultFee = 500;

    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return ConsultFee;
    }
}