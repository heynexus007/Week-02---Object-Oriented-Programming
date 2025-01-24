import java.util.ArrayList;

class Library{
    String libraryName;
    // Declaring arrayList of storing all books
    public ArrayList<Book> books=new ArrayList<>();
    public Library(String libraryName){
        this.libraryName=libraryName;
    }

    public void addBook(Book b){
        books.add(b);
    }

    // Display Library details
    void displayLibraryBooks(){
        System.out.println("In Library : \""+libraryName+ "\" available books are : ");

        for(Book b: books)
        System.out.println("Title : "+ b.title+", Author : " +b.author);
    }
}
// Another class 'Book'
class Book{
    public String title;
    public String author;

    //Parameterized Constructor
    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
}
public class LibraryAndBooks{
    public static void main(String[] args) {
        // Creating objects of Book class
        Book b1= new Book("Java Reference 1", "Herbert Schilt");
        Book b2= new Book("Java Reference 2", "Herber Schilt");
        Book b3= new Book("Java Reference 1", "Herber Schilt");
        
        // Creating objects of Library class
        Library lib1=new Library("Hogwart");
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib1.displayLibraryBooks();
        System.out.println("-----------------------------------");
        Library lib2=new Library("RGPV");
        lib2.addBook(b3);
        lib2.displayLibraryBooks();
    }
}