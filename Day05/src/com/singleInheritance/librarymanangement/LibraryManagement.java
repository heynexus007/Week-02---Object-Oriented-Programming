package com.singleInheritance.librarymanangement;

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {
        //Creating object1 to 'class Book or Author' and giving values
        Book b= new Author("One Piece", 1999,"Eiichiro Oda","Adventured Book");
        b.displayInfo();
    }
}