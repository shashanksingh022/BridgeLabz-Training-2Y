/*Maximum of Three Numbers:
○ Write a program that takes three integer inputs from the user and finds the
maximum of the three numbers.
○ Ensure your program follows best practices for organizing code into modular
functions, such as separate functions for taking input and calculating the
maximum value.
*/

import java.util.Scanner;

public class MaxOfThreeNumbers {

    // Function to take an integer input from the user
    private static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to find the maximum of three integers
    private static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");

        // Calculate maximum
        int max = findMax(num1, num2, num3);

        // Display result
        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }
}
