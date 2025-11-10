/*Problem:
Write a Java program to find the most frequent character in a string.
*/

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] freq = new int[256]; // ASCII characters ke liye

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq(int) [ch]++;
        }

        int maxCount = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFrequent = (char) i;
            }
        }

        System.out.println("Most frequent character: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);

        sc.close();
    }
}
