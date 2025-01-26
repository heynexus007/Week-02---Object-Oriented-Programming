package com.encapsulation.librarymanagementsystem;

// Main class for Library Management
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // creating object to set values
        LibraryItem book = new Book("B263", "One Piece", "Eiichiro Oda");
        LibraryItem magazine = new Magazine("M243", "Marvelous", "Alexander");
        LibraryItem dvd = new DVD("D24", "Avenger", "Stanley");
        // display details
        System.out.println(book.getItemDetails() + ", Loan Duration : " + book.getLoanDuration() + " days");
        System.out.println(magazine.getItemDetails() + ", Loan Duration : " + magazine.getLoanDuration() + " days");
        System.out.println(dvd.getItemDetails() + ", Loan Duration : " + dvd.getLoanDuration() + " days");
    }
}
