/*Create a Product class to manage shopping cart items with the following features:
Static:
○       A static variable discount shared by all products.
○       A static method updateDiscount() to modify the discount percentage.
This:
○       Use this to initialize productName, price, and quantity in the constructor.
Final:
○       Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
○       Validate whether an object is an instance of the Product class before processing its details.
 */

 class Product {
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    static double discount = 10; 
    private static int totalProducts = 0;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
        this.productID = totalProducts; 
    }

    public double getTotalPrice() {
        return quantity * price * (1 - discount / 100);
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after discount: ₹" + getTotalPrice());
            System.out.println("-----------------------------");
        } else {
            System.out.println("Not a valid Product object!");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
        System.out.println("=============================");
    }
}

class Q6 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000, 1);
        Product p2 = new Product("Headphones", 2000, 2);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.updateDiscount(15);

        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
