import java.util.ArrayList;

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Fuel Type : " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        System.out.println("Vehicle \"Car\"");
        super.displayInfo();
        System.out.println("Seat Capicity : " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        System.out.println("\nVehicle \"Truck\"");
        super.displayInfo();
        System.out.println("Load Capicity : " + loadCapacity + "Kg");
    }
}

class Motorcycle extends Vehicle {
    String type;

    Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("\nVehicle \"Motertype\"");
        super.displayInfo();
        System.out.println("Bike Type : " + type);
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Vehicle c = new Car(220, "Deisel", 4);
        Vehicle t = new Truck(180, "Deisel", 120);
        Vehicle m = new Motorcycle(240, "Petrol", "Super Bike");

        Vehicle arr[] = new Vehicle[3];
        arr[0] = c;
        arr[1] = t;
        arr[2] = m;

        for (int i = 0; i < 3; i++) {
            arr[i].displayInfo();
        }
    }
}
