/*Problem:
Write a Java program to remove all occurrences of a specific character from a string.
*/

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char remove = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != remove) {
                result += ch;
            }
        }

        System.out.println("String after removing '" + remove + "': " + result);

        sc.close();
    }
}
