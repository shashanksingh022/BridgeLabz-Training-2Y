/*Problem:
Write a Java program to count how many times a given substring occurs in a string.
*/

import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); // overlap na ho isliye
        }

        System.out.println("Substring occurs " + count + " times.");

        sc.close();
    }
}
