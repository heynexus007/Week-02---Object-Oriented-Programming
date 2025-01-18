class HotelBooking{
    String guestName;
    String roomType;
    int nights;
    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights){
    this.guestName=guestName;
    this.roomType=roomType;
    this.nights=nights;
    }
    // Copy constructor
    HotelBooking(HotelBooking hb){
    this.guestName=hb.guestName;
    this.roomType=hb.roomType;
    this.nights=hb.nights;
    }

void CustomerDetailsDisplay(){
    System.out.println("Guest Name : "+guestName);
    System.out.println("Room type : "+roomType);
    System.out.println("Nights : "+nights);
}
}
public class HotelBookingSystem {
    public static void main(String[] args) {
        // Making obj of PC and Calling parameterized constructor(PC)
        HotelBooking r1=new HotelBooking("Marcos","1BHK",2);
        r1.CustomerDetailsDisplay();
        System.out.println("------------------------------");
        // Creating obj of copy constructor and also called
        HotelBooking r2=new HotelBooking(r1);
        r2.CustomerDetailsDisplay();
    }
}
