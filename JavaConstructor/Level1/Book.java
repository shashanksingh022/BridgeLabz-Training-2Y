/*Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors. */

class Book {
    // attributes (or properties)
    String title;
    String author;
    double price;

    // Default constructor (when no details are given)
    Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor (when details are provided)
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("📚 Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
        System.out.println("---------------------------");
    }

    // main method to test
    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        b1.display();

        // Using parameterized constructor
        Book b2 = new Book("Atomic Habits", "James Clear", 499.0);
        b2.display();
    }
}
