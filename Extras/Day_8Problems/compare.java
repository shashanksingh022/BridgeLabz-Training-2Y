/*Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
*/  

    import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        int result = 0; 

        for (int i = 0; i < minLen; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 != c2) {
                result = c1 - c2; 
                break;
            }
        }

        if (result == 0) {
            result = len1 - len2; 
        }

        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println("First string comes before the second.");
        } else {
            System.out.println("First string comes after the second.");
        }

        sc.close();
    }
}
