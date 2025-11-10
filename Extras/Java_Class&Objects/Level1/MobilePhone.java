/*Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and
price. Add a method to display all the details of the phone. The MobilePhone class uses
attributes to store the phone&#39;s characteristics. The method is used to retrieve and
display this information for each object.   
*/  


import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Mobile Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Mobile Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Mobile Price: ");
        double price = sc.nextDouble();

        // Creating object
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Displaying details
        System.out.println("\n--- Mobile Phone Details ---");
        phone.displayDetails();
    }
}
