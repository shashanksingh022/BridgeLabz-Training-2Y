/*Problem 2: Book Library System
Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
 */

 class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("-----------------------------");
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book ISBN: " + ISBN);
        System.out.println("E-Book Title: " + title);
        System.out.println("E-Book Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("-----------------------------");
    }
}

class Main {
    public static void main(String[] args) {
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayBookDetails();
        b1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

        EBook eb1 = new EBook("978-1491950357", "Clean Architecture", "Robert C. Martin", 5.2);
        eb1.displayEBookDetails();
        eb1.setAuthor("Uncle Bob");
        System.out.println("Updated Author of EBook: " + eb1.getAuthor());
    }
}
