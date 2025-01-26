package com.encapsulation.librarymanagementsystem;

// Subclass 'Magazine'
public class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration in days
    }
}
