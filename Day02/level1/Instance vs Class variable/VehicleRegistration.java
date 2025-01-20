class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 300.0; // Fixed registration fee

    // Constructor -> Parameterized
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee+" rs");
    }

    // Class method to updating registration fee
    static void updateRegistrationFee(double newRegFee) {
        registrationFee = newRegFee;
    }
}

public class VehicleRegistration {
   public static void main(String[] args) {
    // Creating object of Vehicle class for access methods
        Vehicle vec = new Vehicle("Johnny Depp", "Four wheeler");
        vec.displayVehicleDetails();
        Vehicle.updateRegistrationFee(150.0);
        vec.displayVehicleDetails();
   } 
}
