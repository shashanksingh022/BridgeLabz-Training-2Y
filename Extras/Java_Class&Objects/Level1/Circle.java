/*Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius.
Add methods to calculate and display the area and circumference of the circle.
*/  

import java.util.Scanner;

class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        // Creating object
        Circle c = new Circle(radius);

        // Displaying results
        System.out.println("\n--- Circle Details ---");
        c.displayDetails();
    }
}
