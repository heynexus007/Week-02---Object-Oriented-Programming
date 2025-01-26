package com.encapsulation.vehiclerentalsystem;

import java.util.List;

// Abstract class 'Vehicle'
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental costs
    public abstract double calculateRentalCost(int days);

    // Getters and setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Method to display rental and insurance details
    public static void displayVehicleDetails(List<Vehicle> vehicles, int rentalDays) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number : " + vehicle.getVehicleNumber());
            System.out.println("Type : " + vehicle.getType());
            System.out.println("Rental Rate : " + vehicle.getRentalRate());

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days : " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                double insuranceCost = insurable.calculateInsurance();
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost : " + insuranceCost);
            }

            System.out.println("--------------------------");
        }
    }
}
