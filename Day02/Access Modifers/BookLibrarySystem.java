// Problem 2: Book Library System
class Book {
    // Instance variable
    public String ISBN;
    protected String title;
    private String author;

    // Parameterized Constructor for student class
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    // Public method to get auhtor name
    public String getAuthor() {
        return author;
    }
    // Public method to set author name
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Creating a Subclass EBook for Book
class EBook extends Book {
    // Again creating Parameterized Constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    // Method to display Book details
    public void displayBookInfo() {
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title : " + title);
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating object of ebook class for access methods
        EBook ebook = new EBook("156-404-789", "One Piece", "Eiichiro Oda");
        ebook.displayBookInfo();    //Calling display method for eBook
        ebook.setAuthor("dr. Eiichiro Oda");
        System.out.println("Updated Author : " + ebook.getAuthor());
    }
}
