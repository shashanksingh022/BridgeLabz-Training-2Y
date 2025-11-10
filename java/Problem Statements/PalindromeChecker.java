import java.util.Scanner;

public class PalindromeChecker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = getInput("Enter a string to check: ");
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    static String getInput(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    static boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
