/*Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and
price. Add a method to display item details and calculate the total cost for a given
quantity.
*/

import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display details
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); // to consume leftover newline

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        // Creating Item object
        Item item = new Item(code, name, price);

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Displaying details
        System.out.println("\n--- Item Details ---");
        item.displayItem();

        // Calculating total cost
        double total = item.calculateTotalCost(quantity);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}
