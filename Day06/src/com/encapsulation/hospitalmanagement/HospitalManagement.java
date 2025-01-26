package com.encapsulation.hospitalmanagement;

// Main class
public class HospitalManagement {
    public static void main(String[] args) {
        Patient patient1 = new InPatient("PT3474", "Itachi", 29, 2);
        Patient patient2 = new OutPatient("PT4342", "Kakashi", 30);

        System.out.println(patient1.getPatientDetails() + ", Bill: " + patient1.calculateBill());
        System.out.println(patient2.getPatientDetails() + ", Bill: " + patient2.calculateBill());
    }
}
