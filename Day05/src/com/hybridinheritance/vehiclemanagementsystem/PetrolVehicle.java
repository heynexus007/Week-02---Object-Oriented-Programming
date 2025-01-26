package com.hybridinheritance.vehiclemanagementsystem;

// Subclass 'PetrolVehicle' extending 'Vehicle' and implementing Refuelable
public class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity; // Additional attribute for fuel tank capacity

    // Constructor for PetrolVehicle
    public PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementation of refuel() from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(model + " is refueling");
    }

    @Override
    public void VehicleDetails() {
        super.VehicleDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}
