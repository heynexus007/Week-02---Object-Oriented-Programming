package com.encapsulation.rideapplication;

// Abstract class 'Vehicle'
abstract class Vehicle {
    // Vehicle ID, Driver's name, & Rate (private for encapsulation)
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Concrete method to display vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID : " + vehicleId + ", Driver : " + driverName + ", Rate per Km : " + ratePerKm;
    }

    // Getters to getValues
    public double getRatePerKm() {
        return ratePerKm;
    }
}