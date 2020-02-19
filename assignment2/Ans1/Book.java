package assignment2.Ans1;

// 1. Create Java classes having suitable attributes for Library management system.
// Use OOPs concepts in your design.Also try to use interfaces and abstract classes.

public class Book {

    private int bookID;
    private String title;
    private String author;
    private boolean isIssued;
    private String issuedBy;

    public Book(int ID, String name, String writer, boolean issued){
        bookID = ID;
        title = name;
        author = writer;
        isIssued = issued;
    }

    public void getInfo(){
        System.out.println("\nBook ID: " + bookID);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book status: " + (isIssued?"Issued":"Available"));
        if (isIssued)
            System.out.println("Book issued by: " + issuedBy);
    }

    public void issueBook(String borrower){
        this.isIssued = true;
        this.issuedBy = borrower;
        System.out.println("Book successfully issued by " + borrower);
    }

    public void returnBook(){
        this.isIssued = false;
        this.issuedBy = null;
        System.out.println("Book returned on time");
    }



}
