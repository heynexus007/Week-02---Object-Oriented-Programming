class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays){
    this.customerName=customerName;
    this.carModel=carModel;
    this.rentalDays=rentalDays;
    }
    // // Copy constructor
    // CarRental(CarRental hb){
    // this.customerName=hb.customerName;
    // this.carModel=hb.carModel;
    // this.rentalDays=hb.rentalDays;
    // }
void totalRentalCost(){
    int rentCharges=rentalDays*800;
    System.out.println("Car lease cost : "+rentCharges);
}
void CustomerDetailsDisplay(){
    System.out.println("Customer Name : "+customerName);
    System.out.println("Car Model : "+carModel);
    System.out.println("Rental Days for car : "+rentalDays);
}
}
public class CarRentalSystem {
    public static void main(String[] args) {
    // Creating obj of Parameterized constructor and also called
    CarRental cR1=new CarRental("Marcos","Mustang",10);
    cR1.CustomerDetailsDisplay();
    cR1.totalRentalCost();

    }
}
