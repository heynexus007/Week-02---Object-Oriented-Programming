class Book{
    static String libraryName;
    static String title, author;
    final int isbn;

    Book(String title, String author ,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    static void displayLibraryName(String libraryName){
        System.out.println("Library name : "+libraryName);
    }

    void displayDetails(){
        System.out.println("Book title : "+title);
        System.out.println("Book author : "+author);
        System.out.println("Book IBSN no. :"+isbn);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1=new Book("One Piece", "Eiichiro", 4560-762-223);
        b1.displayLibraryName("Harward library");

        System.out.println("-----------------------------");

        System.out.println(" Is object is an instance of the Book class? "+(b1 instanceof Book));
        b1.displayDetails();

    }
}
