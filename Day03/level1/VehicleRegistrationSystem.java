class Vehicle {
    //declaring Instance varable
    static int registrationFee;
    String ownerName, vehicleType;
    final int registrationNumber;

    //Parameterized constructor
    public Vehicle(String ownerName, String vehicleType, int registrationFee, int registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
        this.registrationFee=registrationFee;
    }
    static void updateRegistrationFee(int registrationFee){
        registrationFee+=1500;
    }

        // Display Vehicle details
    void display(){
        System.out.println("Owner Name: "+ ownerName);
        System.out.println("Vehicle type: "+ vehicleType);
        System.out.println("Registration Number: "+ registrationNumber);
    }

}
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Creating object for Constructor
        Vehicle v1=new Vehicle("Kashvi", "Lamborgini", 1500,216325);
        System.out.println("Is object belongs to the Vehicle class? "+ (v1 instanceof Vehicle));

        v1.updateRegistrationFee(1700);
        v1.display();
    }
}
