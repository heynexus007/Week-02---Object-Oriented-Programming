package com.singleInheritance.librarymanangement;

//Creating Subclass 'Author' inherits 'Book' class
public class Author extends Book{
    String name;
    String bio;
    //Constructor
    Author(String title, int publicationYear, String name, String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Auhtor Name : "+name);
        System.out.println("Bio : "+bio);
    }
}
