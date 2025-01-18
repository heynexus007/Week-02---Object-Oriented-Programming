import java.util.Scanner;
class Book{
    String title;
    String author;
    int price;
    //Default Constructor
    Book(){
        this.title="The Jungle Book";
        this.author="Richyard Kipling";
        this.price=900;
    }

    // Parameterized constructor
    Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    // Display book details
    public void displayBookDatails(){
        System.out.println("Book title : "+ title);
        System.out.println("Book author : "+author);
        System.err.println("Book price : "+price);
    }
}
public class BookIn {
    public static void main(String[] args) {
        // Making object  for Default constructor
        Book b1=new Book();
        System.out.println("-----Displayin Book Details-----");
        b1.displayBookDatails();

        // Making object  for Parameterized constructor
        Book b2= new Book();
        System.out.println("\n-----Displayin Book Details-----");
        b2.displayBookDatails();

    }
}
