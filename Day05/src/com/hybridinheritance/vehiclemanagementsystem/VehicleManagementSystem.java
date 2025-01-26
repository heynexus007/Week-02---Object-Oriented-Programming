package com.hybridinheritance.vehiclemanagementsystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating an ElectricVehicle object
        ElectricVehicle Lambo = new ElectricVehicle(200, "Lamborgini", 100);
        Lambo.VehicleDetails();
        Lambo.charge();

        System.out.println();

        // Creating a PetrolVehicle object
        PetrolVehicle Mustang = new PetrolVehicle(180, "Ford Mustang", 60);
        Mustang.VehicleDetails();
        Mustang.refuel();
    }
}
