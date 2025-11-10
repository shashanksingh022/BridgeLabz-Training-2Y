/*Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
 */
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + "), Author: " + name + ", Bio: " + bio);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", 2008);
        Book b2 = new Author("Effective Java", 2018, "Joshua Bloch", "Java expert and author");

        b1.displayInfo();
        b2.displayInfo();

        Book[] shelf = {
            new Book("Design Patterns", 1994),
            new Author("The Pragmatic Programmer", 1999, "Andrew Hunt", "Software craftsmanship advocate")
        };

        for (Book b : shelf) {
            b.displayInfo();
        }
    }
}
