package com.encapsulation.librarymanagementsystem;

// Subclass 'Book' inherited from LibraryItem
public class Book extends LibraryItem implements Reservable {
    private boolean reserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration in days
    }

    @Override
    public void reserveItem() {
        reserved = true;
        System.out.println(getTitle() + " has been reserved");
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
