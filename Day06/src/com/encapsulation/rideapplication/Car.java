package com.encapsulation.rideapplication;

// Subclass 'Car' inherits 'Vehicle' class
public class Car extends Vehicle implements GPS {
    private String currentLocation; // Current location of the car

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Fare = rate per km * distance
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}