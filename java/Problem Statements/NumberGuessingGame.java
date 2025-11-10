import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(guess);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed your number: " + guess);
                guessedCorrectly = true;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else {
                System.out.println("Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm, something went wrong. Are you sure you provided correct feedback?");
        }
    }

    static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    static String getFeedback(int guess) {
        System.out.println("Is your number " + guess + "? (high/low/correct): ");
        return sc.nextLine().trim();
    }
}
