/*Prime Number Checker:
○ Create a program that checks whether a given number is a prime number. ○
The program should use a separate function to perform the prime check and
return the result.
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
