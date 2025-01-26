package com.singleInheritance.librarymanangement;

//Parent class
public class Book{
    String title;
    int publicationYear;
    //
    Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    void displayInfo(){
        System.out.println("-----Book details-----");
        System.out.println("Book Title : "+title);
        System.out.println("Book Publication year : "+publicationYear);
    }
}
