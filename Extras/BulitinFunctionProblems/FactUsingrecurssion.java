/*Factorial Using Recursion:
○ Write a program that calculates the factorial of a number using a recursive
function.
○ Include modular code to separate input, calculation, and output processes.*/

import java.util.Scanner;

public class FactUsingrecurssion {

    // Function to take integer input from user
    private static int getInput(Scanner scanner) {
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }

    // Recursive function to calculate factorial
    private static long factorial(int n) {
        if (n <= 1) { // base case
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Function to display the result
    private static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getInput(scanner);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(number);
            displayResult(number, fact);
        }

        scanner.close();
    }
}
