package com.encapsulation.vehiclerentalsystem;

import java.util.*;

// Main class
public class VehicleRentalSystem {

    public static void main(String[] args) {
        // List of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        Car car= new Car("AR123", "Sedan", 100, "CAR-INS-6545");
        Bike bike = new Bike("BE456", "Racing bike", 50, "BIKE-INS-4364");
        Truck truck = new Truck("TK789", "Loading Truck", 500, 50);
        // Adding vehicles
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Display rental and insurance details for 3 rental days
        Vehicle.displayVehicleDetails(vehicles, 3);
    }
}
