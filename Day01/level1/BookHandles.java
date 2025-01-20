import java.util.Scanner;
class Book{
    String title;
    String author;
    int price;
    // constructor
    Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    // Display book details
    public void display(){
        System.out.println("Book title : "+ title);
        System.out.println("Book author : "+author);
        System.err.println("Book price : "+price);
    }
}
public class BookHandles {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter book details: ");
        String title = input.next();
        String author = input.next();
        int bPrice = input.nextInt();
        
        //Creating book class object
        Book b1=new Book(title, author,bPrice);
        b1.display();
    }
}
