package com.encapsulation.librarymanagementsystem;

// Subclass DVD inherited from LibraryItem
public class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 2; // duration days
    }
}
