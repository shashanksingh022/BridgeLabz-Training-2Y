import java.util.Scanner;

public class FactorialRecursion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getInput("Enter a number to calculate factorial: ");
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    static int getInput(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    static long calculateFactorial(int n) {
        if (n <= 1) return 1;
        return n * calculateFactorial(n - 1);
    }

    static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
