class BookSystem{
    String title;
    String author;
    int price;
    int availability;

    BookSystem(){
        title="One Piece";
        author="Eiichiro Oda";
        price=899;
        availability=4;
    }

    void borrow(int rent){
        availability-=rent;
        System.out.println("Borrow Book: "+ rent +" and Availability "+ availability);
    }
}
public class LibraryBookSystem {
    public static void main(String[] args) {
        BookSystem b1=new BookSystem();
        b1.borrow(2);
    }
}
