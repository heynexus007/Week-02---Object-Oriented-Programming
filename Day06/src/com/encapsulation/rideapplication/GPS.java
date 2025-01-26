package com.encapsulation.rideapplication;

// Interface 'GPS'
interface GPS {
    String getCurrentLocation(); // Get current location of the vehicle
    void updateLocation(String location); // Update the location of the vehicle
}