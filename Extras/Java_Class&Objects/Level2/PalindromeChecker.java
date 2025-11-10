/*3. Program to Check Palindrome String
Problem Statement: Create a PalindromeChecker class with an attribute text. Add
methods to:
● Check if the text is a palindrome.
● Display the result.
Explanation: The PalindromeChecker class holds the text attribute. The methods
operate on this attribute to verify its palindrome status and display the result.
*/

import java.util.Scanner;

class PalindromeChecker {
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }
    // Method to check palindrome
    boolean isPalindrome() {
        String cleanText = text.toLowerCase().replaceAll("\\s+", ""); 
        int left = 0, right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // Method to display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }
}
 class PalindromeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Creating object
        PalindromeChecker checker = new PalindromeChecker(input);

        // Display result
        checker.displayResult();
    }
}
