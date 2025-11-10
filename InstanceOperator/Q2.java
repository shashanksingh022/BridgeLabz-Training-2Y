/*Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
Static:
○       A static variable libraryName shared across all books.
○       A static method displayLibraryName() to print the library name.
This:
○       Use this to initialize title, author, and isbn in the constructor.
Final:
○       Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
○       Verify if an object is an instance of the Book class before displaying its details.
 */

 class Book {
    private String title;
    private String author;
    private final String isbn;

    static String libraryName = "City Central Library";

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Not a valid Book object!");
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("=============================");
    }
}

class Q2 {
    public static void main(String[] args) {
        Book b1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book b2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        Book.displayLibraryName();

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
