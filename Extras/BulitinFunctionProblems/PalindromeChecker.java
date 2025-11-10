/* Palindrome Checker:
○ Write a program that checks if a given string is a palindrome (a word, phrase, or
sequence that reads the same backward as forward).
○ Break the program into functions for input, checking the palindrome condition,
and displaying the result.
*/
import java.util.Scanner;

public class PalindromeChecker {

    // Function to get input string from user
    private static String getInput(Scanner scanner) {
        System.out.print("Enter a string to check if it's a palindrome: ");
        return scanner.nextLine();
    }

    // Function to check if a string is palindrome
    private static boolean isPalindrome(String str) {
        // Normalize the string: remove non-alphanumeric and convert to lower case
        String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to display the result
    private static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = getInput(scanner);
        boolean result = isPalindrome(input);
        displayResult(input, result);

        scanner.close();
    }
}
