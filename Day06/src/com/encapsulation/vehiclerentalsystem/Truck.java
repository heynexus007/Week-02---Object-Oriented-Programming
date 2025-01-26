package com.encapsulation.vehiclerentalsystem;

// Subclass Truck
public class Truck extends Vehicle {
    private double additionalLoadRate;

    // Constructor
    public Truck(String vehicleNumber, String type, double rentalRate, double additionalLoadRate) {
        super(vehicleNumber, type, rentalRate);
        this.additionalLoadRate = additionalLoadRate;
    }

    // Override method to calculate rental cost
    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() + additionalLoadRate) * days;
    }
}
