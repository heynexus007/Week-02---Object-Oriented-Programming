class MovieTicket{
    String movieName;
    static int seatNumber;
    static int price;
    // Constructor
    MovieTicket(String movieName, int seatNumber, int price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
    }
    // Method for booking ticket
    void bookingTicket(int seatNumber, int updatedPrice){
        price+=updatedPrice;
    }
    // Display result
    void display(){
        System.out.println("Movie Name :"+ movieName);
        System.out.println("Movie seat Number : "+seatNumber);
        System.out.println("Movie ticket price : "+ price);
    }
}
public class MovieShow {
    public static void main(String[] args) {
        // creating object for MovieTcket class
        MovieTicket m=new MovieTicket("Wednesday 2", 56, 300);
        //Calling method
        m.bookingTicket(56, 400);
        m.display();
    }
}
