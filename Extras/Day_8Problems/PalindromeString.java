/*Problem:
Write a Java program to check if a given string is a palindrome (a string that reads the
same forward and backward).
*/

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase(); 

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("Yes! It is a Palindrome.");
        } else {
            System.out.println("No! It is not a Palindrome.");
        }

        sc.close();
    }
}
