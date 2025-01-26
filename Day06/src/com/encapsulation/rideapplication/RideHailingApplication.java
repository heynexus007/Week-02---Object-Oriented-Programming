package com.encapsulation.rideapplication;

// Main class
public class RideHailingApplication {
    // Method to process fares dynamically using polymorphism
    public static void calculateFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Distance : " + distance + " km");
        System.out.println("Total Fare : rs" + vehicle.calculateFare(distance));
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating instances of Car, Bike, & Auto
        Vehicle car = new Car("UP652147", "Gangadhar", 10.0);
        Vehicle bike = new Bike("MP35644", "Jimmy", 5.0);
        Vehicle auto = new Auto("AU427563", "Rocky", 7.0);

        // Updating current locations for demonstration
        ((GPS) car).updateLocation("Downtown");
        ((GPS) bike).updateLocation("Suburbs");
        ((GPS) auto).updateLocation("Airport");

        // Calculate fares for different vehicles dynamically
        calculateFare(car, 15);
        calculateFare(bike, 8);
        calculateFare(auto, 12);
    }
}
