/* Fibonacci Sequence Generator:
○ Write a program that generates the Fibonacci sequence up to a specified number
of terms entered by the user.
○ Organize the code by creating a function that calculates and prints the Fibonacci
sequence.*/

import java.util.Scanner;

public class FibonacciGenerator {

    // Function to calculate and print Fibonacci sequence up to n terms
    private static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : "\n"));
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int terms = scanner.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printFibonacci(terms);
        }

        scanner.close();
    }
}
