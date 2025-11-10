import java.util.Scanner;

public class FibonacciGenerator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int terms = getInput("Enter the number of terms for the Fibonacci sequence: ");
        printFibonacci(terms);
    }

    static int getInput(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    static void printFibonacci(int n) {
        int a = 0, b = 1;

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
