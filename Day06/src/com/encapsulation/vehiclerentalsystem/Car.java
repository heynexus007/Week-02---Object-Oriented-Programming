package com.encapsulation.vehiclerentalsystem;

// Subclass 'Car'
public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private static final double INSURANCE_RATE = 0.05; // 5% of the rental cost

    // Constructor
    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implement methods from 'Insurable' interface
    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy : " + insurancePolicyNumber + ", Rate : " + (INSURANCE_RATE * 100) + "%";
    }
}
