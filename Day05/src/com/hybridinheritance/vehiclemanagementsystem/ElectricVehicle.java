package com.hybridinheritance.vehiclemanagementsystem;

// Subclass 'ElectricVehicle' extending 'Vehicle'
public class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // Additional attribute for battery capacity

    // Constructor for ElectricVehicle
    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println(model + " is charging");
    }

    // Overriding displayDetails to include battery info
    @Override
    public void VehicleDetails() {
        super.VehicleDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
