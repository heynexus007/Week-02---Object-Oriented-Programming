package com.hybridinheritance.vehiclemanagementsystem;

public class Vehicle {
    int maxSpeed;
    String model;
    Vehicle (int maxSpeed , String model){
        this.maxSpeed =maxSpeed ;
        this.model=model;
    }
    // Method to display vehicle details
    public void VehicleDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
