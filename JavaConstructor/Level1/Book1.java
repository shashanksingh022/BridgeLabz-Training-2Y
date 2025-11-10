/*Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
 */

 class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book() {
        this("Unknown", "Unknown", 0.0, true);
    }

    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void display() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : ₹" + price);
        System.out.println("Available   : " + (available ? "Yes" : "No"));
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 299.0, true);
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 399.0, true);

        b1.display();
        b1.borrowBook();
        b1.display();

        b2.display();
        b2.borrowBook();
        b2.borrowBook();
    }
}
