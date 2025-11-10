/*4. Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName,
seatNumber, and price. Add methods to:
● Book a ticket (assign seat and update price).
● Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes. The
methods handle booking logic and display ticket details.*/


import java.util.Scanner;

public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Method to book a ticket
    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create ticket object
        MovieTicket ticket = new MovieTicket();

        // Taking user input
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        String seat = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        // Book and display ticket
        ticket.bookTicket(movieName, seat, price);
        ticket.displayTicket();
    }
}
