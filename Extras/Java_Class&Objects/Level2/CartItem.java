/*5. Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and
quantity. Add methods to:
● Add an item to the cart.
● Remove an item from the cart.
● Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle
cart operations like adding or removing items and calculating the total cost.*/

import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    // Add an item
    void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("✅ Item added to cart successfully!");
    }

    // Remove item
    void removeItem() {
        this.itemName = null;
        this.price = 0;
        this.quantity = 0;
        System.out.println("❌ Item removed from cart!");
    }

    // Calculate total cost
    double getTotalCost() {
        return price * quantity;
    }

    // Display item details
    void displayItem() {
        if (itemName != null) {
            System.out.println("\n--- Cart Item ---");
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: ₹" + getTotalCost());
        } else {
            System.out.println("\n🛒 Cart is empty!");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem cart = new CartItem();

        int choice;
        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(name, price, qty);
                    break;

                case 2:
                    cart.removeItem();
                    break;

                case 3:
                    cart.displayItem();
                    break;

                case 4:
                    System.out.println("🛍️ Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 4);
    }
}
