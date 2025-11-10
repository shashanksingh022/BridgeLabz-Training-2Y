/*Number Guessing Game:
○ Write a Java program where the user thinks of a number between 1 and 100, and
the computer tries to guess the number by generating random guesses.
○ The user provides feedback by indicating whether the guess is high, low, or
correct. The program should be modular, with different functions for generating
guesses, receiving user feedback, and determining the next guess.
*/
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    // Generate a random guess within the current range
    private static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }

    // Ask user for feedback on the guess: high, low, or correct
    private static String getUserFeedback(int guess) {
        System.out.println("Is your number " + guess + "? (high/low/correct)");
        return scanner.nextLine().trim().toLowerCase();
    }

    // Main game loop to determine the next guess and adjust range
    public static void playGame() {
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100 (inclusive). I will try to guess it!");

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(guess);

            switch (feedback) {
                case "high":
                    // Guess is too high, adjust upper bound
                    high = guess - 1;
                    break;
                case "low":
                    // Guess is too low, adjust lower bound
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Hooray! I guessed your number!");
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Please enter 'high', 'low', or 'correct'.");
                    break;
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm, there seems to be a contradiction in your answers. Let's try again!");
        }
    }

    public static void main(String[] args) {
        playGame();
        scanner.close();
    }
}
